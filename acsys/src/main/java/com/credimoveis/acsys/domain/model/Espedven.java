package com.credimoveis.acsys.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
public class Espedven {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recnum;
	
	private Long empresa;
	private Long filial;
	private String tipo;
	private Long pedido;
	private String data;
	private String cliente;
	private Long vendedor;
	
	

}
