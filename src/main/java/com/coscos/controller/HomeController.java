package com.coscos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coscos.entity.Cosmetic;
import com.coscos.service.CosmeticService;

@RestController
public class HomeController {
	
	@Autowired
	private CosmeticService cosmeticService;

	@GetMapping("/coscos")
	public  List<Cosmetic> list() {
		List<Cosmetic> list = cosmeticService.getList();
		System.out.println("################" + list);
		return list;
	}
}
