package com.anderson.tdd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.tdd.model.TecnicoModel;
import com.anderson.tdd.repository.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	TecnicoRepository tecnicoRepository;

	public java.util.Optional<TecnicoModel> create(Integer id, String nome, String cpf, String telefone) {
		
		java.util.Optional<TecnicoModel> tecnicoModelOptional = tecnicoRepository.findByCpf(cpf);
		
		//TecnicoModel tec = new TecnicoModel(id, nome, cpf, telefone);
		
		return tecnicoModelOptional;
	}

}
