package com.java.aula04.services;

import com.java.aula04.entities.Pessoa;
import com.java.aula04.requests.PessoaRequest;

import java.util.List;

public interface IPessoaService {

    void salvar(PessoaRequest pessoaRequest);
    List<Pessoa> listarTodos();

}
