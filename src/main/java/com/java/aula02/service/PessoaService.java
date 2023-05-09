package com.java.aula02.service;

import com.java.aula02.models.Pessoa;
import com.java.aula02.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodos(){
        return pessoaRepository.findAll();
    }
}
