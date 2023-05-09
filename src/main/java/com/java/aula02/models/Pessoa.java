package com.java.aula02.models;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(name = "data_de_nascimento", length = 8, nullable = false)
    private String dataDeNascimento;

    @Column(length = 40, nullable = false)
    private String rua;

    @Column(length = 30, nullable = false)
    private String bairro;

    @Column(length = 30, nullable = false)
    private String cidade;

    @Column(name = "sigla_Estado" ,length = 3, nullable = false)
    private String siglaEstado;

    @Column(length = 14, nullable = false)
    private String telefone;

    public Pessoa() {

    }

    public Pessoa(Integer id, String nome, String dataDeNascimento, String rua, String bairro, String cidade, String siglaEstado, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.siglaEstado = siglaEstado;
        this.telefone = telefone;
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return siglaEstado;
    }

    public void setEstado(String estado) {
        this.siglaEstado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + siglaEstado + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome) && Objects.equals(dataDeNascimento, pessoa.dataDeNascimento) && Objects.equals(rua, pessoa.rua) && Objects.equals(bairro, pessoa.bairro) && Objects.equals(cidade, pessoa.cidade) && Objects.equals(siglaEstado, pessoa.siglaEstado) && Objects.equals(telefone, pessoa.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataDeNascimento, rua, bairro, cidade, siglaEstado, telefone);
    }
}
