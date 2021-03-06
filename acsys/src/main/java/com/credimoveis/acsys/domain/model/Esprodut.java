package com.credimoveis.acsys.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
public class Esprodut {
	

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(nullable = false)

	private Long recnum;
	
	@Column(nullable = false)
	private String descr;
	
	@Column(nullable = false)
	private BigDecimal vlr_montagem;
	
	@Column(nullable = false)
	private Long qtde_unid_est;
	
	private BigDecimal vlr_monta_aux;

}
