package com.java.aula02.service;

import com.java.aula02.models.Produtos;
import com.java.aula02.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

        @Autowired
        private ProdutoRepository produtoRepository;

        public List<Produtos> listarTodos(){
            return produtoRepository.findAll();
        }
}
