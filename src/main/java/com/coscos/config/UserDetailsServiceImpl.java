package com.coscos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.coscos.entity.CustomUser;
import com.coscos.entity.Member;
import com.coscos.repository.MemberRepository;

@Service
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {
	
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Member member = memberRepository.findById(username).get();
		if(member == null) {
			throw new UsernameNotFoundException(username + " 없음");
		}
		return new CustomUser(member);
	}

}
