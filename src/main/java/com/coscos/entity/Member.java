package com.coscos.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Member {
	@Id
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_pwd")
	private String password;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_nickname")
	private String userNickname;
	
	@Column(name = "user_phone_number")
	private String userPhoneNumber;
	
	@Column(name = "user_address")
	private String userAddress;
	
	@Column(name = "user_detail_address")
	private String userDetailAddress;
	
	@Column(name = "user_postcode")
	private String userPostcode;
	
	@CreationTimestamp
	@Column(name = "reg_date")
	private LocalDateTime regDate;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	private boolean enabled;
}
