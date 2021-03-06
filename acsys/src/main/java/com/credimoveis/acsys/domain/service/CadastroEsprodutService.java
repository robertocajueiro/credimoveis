package com.credimoveis.acsys.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.credimoveis.acsys.domain.exception.EntidadeEmUsoException;
import com.credimoveis.acsys.domain.exception.EntidadeNaoEncontradaException;
import com.credimoveis.acsys.domain.model.Esprodut;
import com.credimoveis.acsys.domain.repository.EsprodutRepository;

@Service
public class CadastroEsprodutService {
	
	private static final String MSG_PRODUTO_EM_USO
	= "Esprodut código %d não pode ser removida, pois está em uso ";

	private static final String MSG_PRODUTO_NAO_ENCONTRADO 
		= "Não existe esse produto cadastrado no ESPRODUT com código %d ";
	
	@Autowired
	private EsprodutRepository EsprodutRepository;
	
	public Esprodut salvar(Esprodut Esprodut) {
		return EsprodutRepository.save(Esprodut);
	}
	
	public void excluir(Long esprodutId) {
		try {
			EsprodutRepository.deleteById(esprodutId);
		}catch (EmptyResultDataAccessException e) {
						
			throw new EntidadeNaoEncontradaException(
					String.format(MSG_PRODUTO_NAO_ENCONTRADO, esprodutId));
		
		}catch(DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format(MSG_PRODUTO_EM_USO,  esprodutId));
		}
	}
	
	public Esprodut buscarOuFalhar(Long esprodutId) {
		return EsprodutRepository.findById(esprodutId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException(
						String.format(MSG_PRODUTO_NAO_ENCONTRADO, esprodutId)));
	}
}
