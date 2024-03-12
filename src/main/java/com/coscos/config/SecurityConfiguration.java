package com.coscos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeHttpRequests()
			.antMatchers("/","/member/**").permitAll()	// "/" 요쳥과 "/member/**" 요청에 대한 파일 접근은 무조건 허용한다.
			//.antMatchers("/board/**").authenticated()	// board 경로 접근은 인증된 사용자만 허용한다.
			
			.and()
			.formLogin()						// 별도의 로그인 페이가 있으면 아래에 설정해준다
			.loginPage("/member/login")			// 로그인을 해야되는 경우에 이동하는 페이지
			.defaultSuccessUrl("/")				// 로그인이 성공하면 /로 이동한다.
			
			.and()
			.logout()
			.logoutUrl("/member/logout")		// 로그아웃 url
			.logoutSuccessUrl("/");				// 로그아웃에 성공하면 메인 페이지(루트 화면)로 이동한다
		
		http.userDetailsService(userDetailsService);
		return http.build();
	}
}
