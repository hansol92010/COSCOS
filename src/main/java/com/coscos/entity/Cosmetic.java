package com.coscos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cosmetic {
	
	@Id
	@Column(name = "product_no")
	private Long productNo;

	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_price")
	private String productPrice;

}
