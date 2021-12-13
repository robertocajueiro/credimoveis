package com.credimoveis.acsys.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credimoveis.acsys.domain.model.Espedven;
import com.credimoveis.acsys.domain.repository.EspedvenRepository;

@RestController
@RequestMapping(value = "/espedven")
public class EspedvenController {
	
	@Autowired
	private EspedvenRepository espedvenRepository;
	
	@GetMapping
	public List<Espedven> listar(){
		return espedvenRepository.findAll();
	}
	
	@GetMapping("/{filialId}")
	public ResponseEntity<Espedven> buscar(@PathVariable Long filialId){
		Optional<Espedven> espedven = espedvenRepository.findById(filialId);
		
		if (espedven.isPresent()) {
			return ResponseEntity.ok(espedven.get());
		}
		
		return ResponseEntity.notFound().build();
	}
	

}
