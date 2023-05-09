package com.java.aula01.heranca;

// import java.util.Objects;

public class Enfermeiro extends Pessoa {
    private double horarioDeTrabalho;
    private String setor;
    private String numeroCadastro;

    public Enfermeiro() {
    }

    public Enfermeiro(Integer id, String nome, double horarioDeTrabalho, String setor, String numeroCadastro) {
        super(id, nome);
        this.horarioDeTrabalho = horarioDeTrabalho;
        this.setor = setor;
        this.numeroCadastro = numeroCadastro;
    }

    public double getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    public void setHorarioDeTrabalho(double horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(String numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }

    @Override
    public String toString() {
        return "Enfermeiro{" +
                "horarioDeTrabalho=" + horarioDeTrabalho +
                ", setor='" + setor + '\'' +
                ", numeroCadastro='" + numeroCadastro + '\'' +
                "} " + super.toString();
    }

}
