package com.java.aula01.heranca;

import com.java.aula01.interfaces.ICalculoSalario;

//herança - herda as caracteristicas da Pessoa
public class PessoaJuridica extends Pessoa implements ICalculoSalario {

    private String cnpj;
    private String inscricaoEstadual;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String inscricaoEstadual) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                "} " + super.toString();
    }

    //polimorfismo - poli - muitas formas
    @Override
    public Double calcularSalarioLiquido(Double salarioBruto, Double despesas) {
        return salarioBruto - despesas;
    }
}
