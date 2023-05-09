package com.java.aula02.controllers;

import com.java.aula02.models.Produtos;
import com.java.aula02.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/listar")
    public List<Produtos> listarTodos(){

        return produtoService.listarTodos();
    }
}
