package com.coscos.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "MEMBER")
public class Member {
	@Id
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_pwd", nullable = false)
	private String password;
	
	@Column(name = "user_name", nullable = false)
	private String userName;
	
	@Column(name = "user_nickname", nullable = false)
	private String userNickname;
	
	@Column(name = "user_phone_number", nullable = false)
	private String userPhoneNumber;
	
	@Column(name = "user_address", nullable = false)
	private String userAddress;
	
	@Column(name = "user_detail_address", nullable = false)
	private String userDetailAddress;
	
	@Column(name = "user_postcode", nullable = false)
	private String userPostcode;
	
	@CreationTimestamp
	@Column(name = "reg_date", nullable = false)
	private LocalDateTime regDate;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(nullable = false)
	private boolean enabled;
}
