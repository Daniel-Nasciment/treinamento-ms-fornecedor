package br.com.alura.microservice.fornecedor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger LOG = LoggerFactory.getLogger(InfoController.class);
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping(value = "/{estado}")
	public ResponseEntity<?> devolveEndereco(@PathVariable String estado) {
		
		LOG.info("recebido o pedido de informações do fornecedor de {}", estado);
		
		Fornecedor fornecedor = infoService.getInfoPorEstado(estado);
		
		return ResponseEntity.ok(fornecedor) ;
	}


}
