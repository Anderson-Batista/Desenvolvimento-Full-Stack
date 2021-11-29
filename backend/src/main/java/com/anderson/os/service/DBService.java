package com.anderson.os.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anderson.os.domain.Cliente;
import com.anderson.os.domain.OS;
import com.anderson.os.domain.Tecnico;
import com.anderson.os.domain.enuns.Prioridade;
import com.anderson.os.domain.enuns.Status;
import com.anderson.os.repositories.ClienteRepository;
import com.anderson.os.repositories.OSRepository;
import com.anderson.os.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Anderson Batista", "869.519.280-61", "(00) 98888-8888");
		Tecnico t2 = new Tecnico(null, "Henrique Batista", "343.970.610-92", "(00) 97777-6666");
		Cliente c1 = new Cliente(null, "Betina Campos", "382.718.760-58", "(00) 97777-7777");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}
