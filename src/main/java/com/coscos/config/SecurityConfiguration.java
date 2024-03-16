package com.coscos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
			.antMatchers("/","/coscos/**").permitAll();	// "/" 요쳥과 "/coscos/**" 요청에 대한 파일 접근은 무조건 허용한다.
            //.anyRequest().authenticated();
			
/*			.and()
			.formLogin()							// 별도의 로그인 페이지가 있으면 아래에 설정해준다
			.loginPage("/coscos/login")				// 로그인을 해야되는 경우에 이동하는 페이지
			.loginProcessingUrl("/coscos/doLogin")
			.defaultSuccessUrl("/")					// 로그인이 성공하면 /로 이동한다.
			
			.and()
			.logout()
			.logoutUrl("/logout")				// 로그아웃 url
			.logoutSuccessUrl("/");				// 로그아웃에 성공하면 메인 페이지(루트 화면)로 이동한다
*/		
		http.userDetailsService(userDetailsService);
		return http.build();
	}
}
