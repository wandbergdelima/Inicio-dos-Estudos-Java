package com.java.aula01.principal;

import com.java.aula01.models.Produto;

import java.util.Date;

public class Principal2 {

    public static void main(String[] args) {
        // Produto produto1 = new Produto();
        Produto produto2 = new Produto(10L, new Date());
        // Produto produto3 = new Produto(11L, new Date(), "Coca cola");

        System.out.println(produto2.getId());
        System.out.println(produto2.getDataInsercao());

    }
}
