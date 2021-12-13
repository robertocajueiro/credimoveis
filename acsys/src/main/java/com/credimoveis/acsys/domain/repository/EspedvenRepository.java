package com.credimoveis.acsys.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credimoveis.acsys.domain.model.Espedven;

@Repository
public interface EspedvenRepository extends JpaRepository<Espedven, Long> {
	List<Espedven> findTodasByFilial(Long filial);
	
	Optional<Espedven> findByFilial(Long filial);

}
