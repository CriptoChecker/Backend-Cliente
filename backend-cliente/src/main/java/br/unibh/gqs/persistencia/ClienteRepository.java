package br.unibh.gqs.persistencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.unibh.gqs.entidades.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	List<Cliente> findByNome(String nome);
	
	List<Cliente> findByCpf(String cpf);

	Cliente findById(long id);

}