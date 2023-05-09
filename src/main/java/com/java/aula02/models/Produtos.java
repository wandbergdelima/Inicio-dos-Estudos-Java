package com.java.aula02.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "produto")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(name = "preco_Compra",length = 50, nullable = false)
    private Double precoCompra;

    @Column(name = "preco_Venda",length = 50, nullable = false)
    private Double precoVenda;

    public Produtos() {

    }

    public Produtos(Integer id, String nome, Double precoCompra, Double precoVenda) {
        this.id = id;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Produtos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", precoCompra=" + precoCompra +
                ", precoVenda=" + precoVenda +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Objects.equals(id, produtos.id) && Objects.equals(nome, produtos.nome) && Objects.equals(precoCompra, produtos.precoCompra) && Objects.equals(precoVenda, produtos.precoVenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, precoCompra, precoVenda);
    }

}
