package br.com.alura.microservice.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.entity.Fornecedor;
import br.com.alura.microservice.fornecedor.service.InfoService;

@RestController
@RequestMapping(value = "/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping(value = "/{estado}")
	public ResponseEntity<?> devolveEndereco(@PathVariable String estado) {
		
		
		Fornecedor fornecedor = infoService.getInfoPorEstado(estado);
		
		return ResponseEntity.ok(fornecedor) ;
	}


}
