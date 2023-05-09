package com.java.aula01.collections;

import com.java.aula01.heranca.Pessoa;

// import java.util.ArrayList;
import java.util.HashSet;
// import java.util.List;
import java.util.Set;

public class Principal5 {

    public static void main(String[] args) {
        // Set - nao pode ter dados duplicados
        // HashSet nao ordenação
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(30);
        numeros.add(50);
        numeros.add(25);
        numeros.add(10);
        numeros.add(10);
        numeros.add(10);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        Set<Pessoa> pessoas = new HashSet<>();

        Pessoa pessoa = new Pessoa();
        pessoa.setId(10);
        pessoa.setNome("Maria");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setId(10);
        pessoa2.setNome("Maria");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setId(20);
        pessoa3.setNome("João");

        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

    }
}
