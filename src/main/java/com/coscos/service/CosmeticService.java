package com.coscos.service;

import java.util.List;

import com.coscos.entity.Cosmetic;

public interface CosmeticService {
	public List<Cosmetic> getList();
	public List<Cosmetic> getNewList();
	public List<Cosmetic> getSalesList();
}
