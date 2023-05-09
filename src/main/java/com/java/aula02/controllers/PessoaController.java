package com.java.aula02.controllers;

import com.java.aula02.models.Pessoa;
// import com.java.aula02.repositories.PessoaRepository;
import com.java.aula02.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/listar")
    public List<Pessoa> listarTodos() {
        return pessoaService.listarTodos();
    }
}
