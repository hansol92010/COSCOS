package com.coscos.entity;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import lombok.Data;

@Data
public class CustomUser extends User {
	
	private Member member;		// 사용자의 추가정보를 활용하기 위해
	
	public CustomUser(Member member) {
		super(member.getUserId(), member.getPassword(), AuthorityUtils.createAuthorityList("ROLE_" + member.getRole().toString()));
		this.member = member;
	}
}
