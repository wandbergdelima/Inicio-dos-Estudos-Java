package com.java.aula01.heranca;

import com.java.aula01.interfaces.ICalculoSalario;

public class PessoaFisica extends Pessoa implements ICalculoSalario {

    private String cpf;
    private String rg;

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //retorna assinatura do meu objeto

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                "} " + super.toString();
    }

    @Override //sobreescrita
    public Double calcularSalarioLiquido(Double salarioBruto, Double despesas) {
        return salarioBruto - despesas - (salarioBruto * 0.06);
    }

}
