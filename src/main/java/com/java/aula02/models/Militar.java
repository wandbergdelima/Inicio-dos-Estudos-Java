package com.java.aula02.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "militar")
public class Militar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(name = "nome_Guerra",length = 50, nullable = false)
    private String nomeGuerra;
    @Column(length = 30, nullable = false)
    private String posto;


    public Militar() {

    }

    public Militar(Integer id, String nome, String nomeGuerra, String posto) {
        this.id = id;
        this.nome = nome;
        this.nomeGuerra = nomeGuerra;
        this.posto = posto;

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

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    @Override
    public String toString() {
        return "Militar{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nomeGuerra='" + nomeGuerra + '\'' +
                ", posto='" + posto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Militar militar = (Militar) o;
        return Objects.equals(id, militar.id) && Objects.equals(nome, militar.nome) && Objects.equals(nomeGuerra, militar.nomeGuerra) && Objects.equals(posto, militar.posto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nomeGuerra, posto);
    }

}
