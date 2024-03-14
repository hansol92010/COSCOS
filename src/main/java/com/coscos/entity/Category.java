package com.coscos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Entity
@Data
@Table(name = "CATEGORY")
public class Category {
	@Id
	@Column(name = "category_code")
	private Long categoryCode;				// 메인 카테고리 코드
	
	@Column(name = "parent_category_code")
	private Long parentCategoryCode;		// 부모 카테고리 코드
	
	@Column(name = "category_name", nullable = false)
	private String CategoryName; 			// 카테고리 이름
}
