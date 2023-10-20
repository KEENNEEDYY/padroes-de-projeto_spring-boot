package org.desenvolvedorkennedy.gof.repositories;

import org.desenvolvedorkennedy.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
