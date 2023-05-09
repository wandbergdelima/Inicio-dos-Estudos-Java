package com.java.aula04.controllers;


import com.java.aula04.entities.Pessoa;
import com.java.aula04.requests.PessoaRequest;
import com.java.aula04.responses.EnderecoResponse;
import com.java.aula04.services.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private IPessoaService pessoaService;

    @PostMapping("/salvar")
    public ResponseEntity salvar(@RequestBody PessoaRequest pessoaRequest){
        try{
            pessoaService.salvar(pessoaRequest);
            return ResponseEntity.ok("Pessoa cadastrada com sucesso");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/listar")
    public List<Pessoa> listarTodos(){
        try{
            return pessoaService.listarTodos();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}







