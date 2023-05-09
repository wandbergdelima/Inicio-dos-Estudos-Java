package com.java.aula01.models;


//Classe é tudo que representa algo no mundo real. Ex: Pessoa, Produto, Vendas, Militar, Fornecedores
//PessoaJuridica
//atributos(caracteristicas) e metodos(ações)
//public - acesso liberado
public class Pessoa {

    //atributos
    //private - somente dentro da classe
    //Integer - numeros inteiros (1, 2, 100, etc)
    //String - sao caracteres (1, a, @)
    //Double - real (1, 10.56,48, 25.36)
    //Boolean - True or False
    private Integer id;
    private String nome;
    private Double salario;
    private String email;
    private Boolean ativo;

    public Pessoa(){

    }

    public Pessoa(Integer id, String nome, Double salario, String email, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.email = email;
        this.ativo = ativo;
    }

    //Encapsulamento - Consiste em proteger meu atributo do acesso externo,
    //dando lhe acesso atraves de um metodos
    //metodos
    //get - saida de dados
    //set - entradas de dados
    public Integer getId(){
        return this.id;
    }
    //void - nao retorna
    //Value Object - VO
    public void setId(Integer id){
        this.id = id;
    }
    
    //alt + insert
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
