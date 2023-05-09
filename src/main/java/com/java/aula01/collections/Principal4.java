package com.java.aula01.collections;

// import com.java.aula01.heranca.Pessoa;
// import com.java.aula01.heranca.PessoaFisica;

import java.util.ArrayList;
import java.util.List;

public class Principal4 {

    public static void main(String[] args) {
        // Collections (List, Set, Map)
        // Coleções
        // numeros - objeto do tipo lista
        // exibe do jeito que é implementado
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);
        numeros.add(25);
        numeros.add(10);

        /*
         * for (int i = 0; i < numeros.size(); i++) {
         * System.out.println(numeros.get(i));
         * }
         */
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
