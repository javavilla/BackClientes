package co.edu.unbosque.lagenericiclo4.BackClientes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import co.edu.unbosque.lagenericiclo4.BackClientes.model.*;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
	List<Cliente> findByCedulaContaining(String cedula); //buscar elemento por cedula
	Optional<Cliente> findByCedula(String cedula); //actualizar por cedula
	void deleteByCedula(String cedula); //eliminar documento por cedula
}
