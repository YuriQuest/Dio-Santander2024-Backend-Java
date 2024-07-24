package one.digitalinovation.gof.service.impl;

import org.springframework.stereotype.Service;

import one.digitalinovation.gof.model.Cliente;
import one.digitalinovation.gof.service.ClienteService;

/**
 * 
 * @author YuriQuest
 */

@Service
public class ClienteServiceImpl implements ClienteService{

    @Override
    public Iterable<Cliente> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public void inserir(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    
}