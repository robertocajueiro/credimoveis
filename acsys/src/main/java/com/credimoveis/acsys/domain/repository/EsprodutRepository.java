package com.credimoveis.acsys.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credimoveis.acsys.domain.model.Esprodut;

@Repository
public interface EsprodutRepository extends JpaRepository<Esprodut, Long> {
	
List<Esprodut> findTodasByCodigoContaining(String codigo); // Containing usa Like %%
	
	Optional<Esprodut> findByCodigo(String codigo);
	
	boolean existsByCodigo(String codigo);
}
