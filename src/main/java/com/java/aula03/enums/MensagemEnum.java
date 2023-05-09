package com.java.aula03.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MensagemEnum {

    CADASTRO("Registro inserido com sucesso"),
    ALTERACAO("Registro alterado com sucesso"),
    EXCLUSAO("Registro Excluido com sucesso");

    @Getter
    private String value;


}
