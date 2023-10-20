package org.desenvolvedorkennedy.gof.repositories;

import org.desenvolvedorkennedy.gof.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
    
}
