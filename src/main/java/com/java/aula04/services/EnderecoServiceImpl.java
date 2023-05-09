package com.java.aula04.services;

import com.java.aula04.clients.EnderecoClient;
import com.java.aula04.entities.Endereco;
import com.java.aula04.repositories.EnderecoRepository;
import com.java.aula04.responses.EnderecoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements IEnderecoService{

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EnderecoClient enderecoClient;

    @Override
    public Endereco salvar(String cep) throws Exception {

        EnderecoResponse enderecoResponse = enderecoClient.buscarPorCep(cep);

        Endereco endereco = new Endereco();

        endereco.setCep(enderecoResponse.getCep());
        endereco.setLogradouro(enderecoResponse.getLogradouro());
        endereco.setBairro(enderecoResponse.getBairro());
        endereco.setLocalidade(enderecoResponse.getLocalidade());
        endereco.setUf(enderecoResponse.getUf());

        return enderecoRepository.save(endereco);
    }

    @Override
    public List<Endereco> listarTodos() {

        return enderecoRepository.findAll();
    }

    @Override
    public Endereco buscarPorCep(String cep) {

        return enderecoRepository.buscarPorCep(cep);
    }


}
