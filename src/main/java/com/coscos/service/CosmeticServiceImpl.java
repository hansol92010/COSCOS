package com.coscos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.coscos.entity.Cosmetic;
import com.coscos.repository.CosmeticRepository;

@Service
public class CosmeticServiceImpl implements CosmeticService {

	@Autowired
	private CosmeticRepository cosmeticRepository;

	@Override
	public List<Cosmetic> getList() {
		List<Cosmetic> list = cosmeticRepository.findAll();
		return list;
	}

	@Override
	public List<Cosmetic> getNewList() {
		List<Cosmetic> list = cosmeticRepository.findAll(Sort.by(Sort.Direction.DESC, "regDate"));
		return list;
	}

	@Override
	public List<Cosmetic> getSalesList() {
		List<Cosmetic> list = cosmeticRepository.findAll(Sort.by(Sort.Direction.DESC, "productSales"));
		return list;
	}
	
	
}
