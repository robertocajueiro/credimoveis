package com.credimoveis.acsys.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credimoveis.acsys.domain.model.Esprodut;
import com.credimoveis.acsys.domain.repository.EsprodutRepository;
import com.credimoveis.acsys.domain.service.CadastroEsprodutService;

@RestController
@RequestMapping(value = "/api/esprodut")
@CrossOrigin(origins = "http://localhost:4200")
public class EsprodutController {
	
	@Autowired
	private EsprodutRepository esprodutRepository;
	
	@Autowired
	private CadastroEsprodutService cadastroProduto;
	
	@GetMapping
	public List<Esprodut> listar() {
		return esprodutRepository.findAll();
	}
	
	@GetMapping("/{produtoId}")
	public Esprodut buscar(@PathVariable Long produtoId) {
		return cadastroProduto.buscarOuFalhar(produtoId);
	}
	
	@PutMapping("/{codigoId}")
	public Esprodut atualizar(@PathVariable Long codigoId,
			@RequestBody Esprodut esprodut) {
		Esprodut esprodutAtual = cadastroProduto.buscarOuFalhar(codigoId);
		
		BeanUtils.copyProperties(esprodut, esprodutAtual, 
				"codigo", "descr", "qtde_unid_est", "recnum", "vlr_monta_aux" );
		
		return cadastroProduto.salvar(esprodutAtual);
	}

}
