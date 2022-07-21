package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.entity.Fornecedor;

@Repository
public interface InfoRepository extends JpaRepository<Fornecedor, Long> {

	Fornecedor findByEstado(String estado);

}
