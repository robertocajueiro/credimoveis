package com.credimoveis.acsys.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credimoveis.acsys.domain.model.Account;
import com.credimoveis.acsys.domain.repository.AccountRepository;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@GetMapping
	public List<Account> listar() {
		return accountRepository.findAll();
		
	}
	

}
