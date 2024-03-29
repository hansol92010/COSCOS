package com.coscos.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coscos.entity.Cosmetic;
import com.coscos.service.CosmeticService;

@RestController
public class HomeController {
	
	@Autowired
	private CosmeticService cosmeticService;
	
	@Value("${servlet.multipart.location}")
	private String filepath;

	@GetMapping("/coscos/latest")
	public  List<Cosmetic> getNewList() {
		List<Cosmetic> list = cosmeticService.getNewList().subList(0, 4);
		System.out.println("####################" + list);
		return list;
	}
	
	@GetMapping("/coscos/sales")
	public  List<Cosmetic> getSalesList() {
		List<Cosmetic> list = cosmeticService.getSalesList().subList(0, 4);
		System.out.println("####################" + list);
		return list;
	}
	
	@GetMapping("/coscos/display")
	public ResponseEntity<Resource> display(@RequestParam("filename") String filename) {
		String path = filepath + "\\product\\";
		System.out.println(path);
		String folder = "";
		Resource resource = new FileSystemResource(path + folder + filename);
		if(!resource.exists()) 
			return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND);
		HttpHeaders header = new HttpHeaders();
		Path filePath = null;
		try{
			filePath = Paths.get(path + folder + filename);
			header.add("Content-type", Files.probeContentType(filePath));
		}catch(IOException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Resource>(resource, header, HttpStatus.OK);
	}
}
