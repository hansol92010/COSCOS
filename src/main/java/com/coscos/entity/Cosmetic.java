package com.coscos.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "COSMETIC")
@SequenceGenerator(
        name = "COSMETIC_SEQ_GENERATOR",
        sequenceName = "COSMETIC_SEQ",
        initialValue = 1001,
        allocationSize = 1
)
public class Cosmetic {
	
	@Id
	@Column(name = "product_no")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COSMETIC_SEQ_GENERATOR")
	private Long productNo;

	@Column(name = "product_name", nullable = false)
	private String productName;
	
	@Column(name = "product_price", nullable = false)
	private Long productPrice;
	
	@Column(name = "file_name", nullable = false)
	private String fileName;
	
	@OneToOne(targetEntity = Category.class)
	@JoinColumn(name = "category_code")
	private Category category;
	
	@Column(name = "product_stock", nullable = false)
	private Long productStock;
	
	@Column(name = "product_sales")
	@ColumnDefault("0")
	private Long productSales;
	
	@Column(name = "product_desc", nullable = false)
	private String productDesc;
	
	@CreationTimestamp
	@Column(name =  "reg_date")
	private LocalDateTime regDate;
	
}
