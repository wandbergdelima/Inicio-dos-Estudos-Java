package com.java.aula01.principal;

import com.java.aula01.heranca.PessoaFisica;
import com.java.aula01.heranca.PessoaJuridica;

public class Principal3 {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setId(10);
        pessoaFisica.setNome("Maria");
        pessoaFisica.setCpf("1466556566");
        pessoaFisica.setRg("122323232");


        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setId(11);
        pessoaJuridica.setNome("Maria confecções LTDA");
        pessoaJuridica.setCnpj("12232323565656/0001-8989");
        pessoaJuridica.setInscricaoEstadual("1323356");

         System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);

        System.out.println(pessoaFisica.calcularSalarioLiquido(15000D,5000D));
        System.out.println(pessoaJuridica.calcularSalarioLiquido(15000D,5000D));

    }
}
