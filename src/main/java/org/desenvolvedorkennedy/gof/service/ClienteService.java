package org.desenvolvedorkennedy.gof.service;

import org.desenvolvedorkennedy.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
  * @author <a href="httsp://portfolio.desenvolvedor-kennedy.com.br">desenvolvedorkennedy</a>
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
    
}
