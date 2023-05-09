package com.java.aula04.responses;

import lombok.Data;

@Data
public class EnderecoResponse {

    private String cep;
    private String logradouro;
    private String localidade;
    private String bairro;
    private String uf;
}
