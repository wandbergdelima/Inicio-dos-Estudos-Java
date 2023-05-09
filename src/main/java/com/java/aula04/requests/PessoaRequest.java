package com.java.aula04.requests;

import lombok.Data;

import java.util.Date;

@Data
public class PessoaRequest {

    private String nome;
    private String telefone;
    private Date dataNascimento;
    private String cep;
}
