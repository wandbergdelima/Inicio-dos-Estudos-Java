package com.java.aula04.services;

import com.java.aula04.entities.Endereco;

import java.util.List;

public interface IEnderecoService {

    Endereco salvar(String cep)throws Exception;
    List<Endereco> listarTodos();
    Endereco buscarPorCep(String cep);
}
