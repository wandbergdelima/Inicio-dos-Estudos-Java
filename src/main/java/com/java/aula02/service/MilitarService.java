package com.java.aula02.service;

import com.java.aula02.models.Militar;
import com.java.aula02.repositories.MilitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilitarService {

    @Autowired
    private MilitarRepository militarRepository;

    public List<Militar> listarTodos(){
        return militarRepository.findAll();
    }
}
