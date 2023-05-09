package com.java.aula02.controllers;

import com.java.aula02.models.Militar;
import com.java.aula02.service.MilitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/militar")
public class MilitarController {
    @Autowired
    private MilitarService militarService;

    @GetMapping("/listar")
    public List<Militar> listarTodos(){

        return militarService.listarTodos();
    }


}




