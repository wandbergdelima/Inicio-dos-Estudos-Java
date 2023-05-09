package com.java.aula04.controllers;

import com.java.aula04.clients.EnderecoClient;
import com.java.aula04.responses.EnderecoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoClient enderecoClient;

    @GetMapping("/buscar")
    public EnderecoResponse buscarPorCep(@RequestParam("cep") String cep){
        try{
            return enderecoClient.buscarPorCep(cep);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}










