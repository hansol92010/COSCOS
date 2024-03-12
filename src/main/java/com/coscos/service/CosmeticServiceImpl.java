package com.coscos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coscos.entity.Cosmetic;
import com.coscos.repository.CosmeticRepository;

@Service
public class CosmeticServiceImpl implements CosmeticService {

	@Autowired
	private CosmeticRepository cosmeticRepository;

	@Override
	public List<Cosmetic> getList() {
		return cosmeticRepository.findAll();
	}
	
	
}
