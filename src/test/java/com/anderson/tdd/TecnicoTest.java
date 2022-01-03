package com.anderson.tdd;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.anderson.tdd.model.TecnicoModel;
import com.anderson.tdd.repository.TecnicoRepository;
import com.anderson.tdd.service.TecnicoService;

@RunWith(SpringRunner.class) // faz uma ponte entre os recursos do Junit e SpringBoot
public class TecnicoTest {
	
	@TestConfiguration
	static class TecnicoTestConfiguration {
		
		@Bean
		public TecnicoService tecnicoService() {
			return new TecnicoService();
		}
		
	}
	
	@Autowired
	TecnicoService tecnicoService;
	
	@MockBean
	TecnicoRepository tecnicoRepository;
	
	@Test
	public void cadastrarTecnicoTest() {
		Integer id = 1;
		String nome = "Carlitos Oliveira";
		String cpf = "120.083.234.50";
		String telefone = "99878-1254";
		
		Optional<TecnicoModel> tecnico = tecnicoService.create(id, nome, cpf, telefone);
		
		Assertions.assertTrue(tecnico.isPresent());
	}
	
	@Before
	public void setup() {
		TecnicoModel tecnico = new TecnicoModel(1, "Carlitos Oliveira", "120.083.234.50", "99878-1254");
		
		Mockito.when(tecnicoRepository.findByCpf(tecnico.getCpf())).thenReturn(java.util.Optional.of(tecnico));
		
	}

}
