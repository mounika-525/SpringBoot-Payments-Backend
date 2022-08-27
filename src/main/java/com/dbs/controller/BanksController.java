package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.model.Banks;
import com.dbs.service.BanksService;

@CrossOrigin("*")
@RestController
@RequestMapping("/banksapi")
public class BanksController {

	@Autowired
	private BanksService banksService;
	
	@GetMapping("/banks")
	public List<Banks> get() {
		return banksService.get();
	}
	
	@GetMapping("/banks/{bic}")
	public Banks get(@PathVariable String bic) {
		return banksService.get(bic);
	}
}
