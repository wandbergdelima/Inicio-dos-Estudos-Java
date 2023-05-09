package com.java.aula01.principal;

import com.java.aula01.models.Pessoa;

public class Principal1 {

    public static void main(String[] args) {
        // tipo primitivo (espaço de memoria do tipo inteiro)
        // int idade = 26;
        // objeto
        // (ctrl + shift + /) comentario de bloco
        // Integer idad = 36;

        // if(idade.equals(40)){
        // System.out.println("Velho");
        // } else {
        // System.out.println("Novo");
        // }

        // Criando objeto (pessoa)
        // instancia de uma classe(copia)
        // new estou dando espaço de memoria para poder trabalhar

        // System.out.println("Só para teste" + idade);
        // System.out.println("Só para teste" + idad);
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);
        pessoa.setNome("Wandberg");
        pessoa.setEmail("wandberg@gmail.com");
        pessoa.setAtivo(true);

        System.out.println(pessoa.getId());
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getEmail());
        System.out.println(pessoa.getAtivo());

    }
}
