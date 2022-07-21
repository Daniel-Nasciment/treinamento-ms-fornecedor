package br.com.alura.microservice.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.entity.Fornecedor;
import br.com.alura.microservice.fornecedor.repository.InfoRepository;

@Service
public class InfoService {

	
	@Autowired
	private InfoRepository infoRepository;
	
	public Fornecedor getInfoPorEstado(String estado) {
		
		return infoRepository.findByEstado(estado);
		
		
		
	}

}
