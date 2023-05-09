package com.java.aula01.heranca;

public class Paciente extends Pessoa {
    private Integer matricula;
    private String planoDeSaude;

    public Paciente() {

    }

    public Paciente(Integer id, String nome, Integer matricula, String planoDeSaude) {
        super(id, nome);
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "matricula=" + matricula +
                ", planoDeSaude='" + planoDeSaude + '\'' +
                "} " + super.toString();
    }

    //Sobreescreve o metodo e herdar informações
    public void imprimirInfo(){
        super.imprimirInfo(); //Sobreescrita e herança
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Plano de Saúde: " + this.planoDeSaude);

    }
}
