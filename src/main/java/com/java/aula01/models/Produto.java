package com.java.aula01.models;

import java.util.Date;

public class Produto {

    //Long - tamanho maior (numeros inteiros)
    private Long id;
    //Date - classe que trabalha com datas
    private Date dataInsercao;
    private Double precoCompra;
    private Double precoVenda;
    private String descricao;


    //metodos construtores
    //encapsulamento com construtor
    //construtor vazio
    public Produto(){

    }
    //construtor cheio
    //sobre carga de metodos
    public Produto(Long id, Date dataInsercao){
        this.id = id;
        this.dataInsercao = dataInsercao;
    }

    public Produto(Long id, Date dataInsercao, String descricao){
        this.id = id;
        this.dataInsercao = dataInsercao;
        this.descricao = descricao;
    }


    //metodos get e set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(Date dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
