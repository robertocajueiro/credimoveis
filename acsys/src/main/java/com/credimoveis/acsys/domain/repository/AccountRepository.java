package com.credimoveis.acsys.domain.repository;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credimoveis.acsys.domain.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	List<Account> findTodasByAccountdescription(String accountdescription);
	
	//Optional<Account> findByNome(String accountdescription);

}
