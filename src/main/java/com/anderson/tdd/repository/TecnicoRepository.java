package com.anderson.tdd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.tdd.model.TecnicoModel;

public interface TecnicoRepository extends JpaRepository<TecnicoModel, Integer>{

	Optional<TecnicoModel> findByCpf(String cpf);
}
