package com.java.aula01.relacionamentos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Pedidos implements Serializable {

    private Integer id;
    private Pessoa pessoa;
    private Date dataPedido;

    public Pedidos() {
    }

    public Pedidos(Integer id, Pessoa pessoa, Date dataPedido) {
        this.id = id;
        this.pessoa = pessoa;
        this.dataPedido = dataPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", dataPedido=" + dataPedido +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedidos pedidos = (Pedidos) o;
        return Objects.equals(id, pedidos.id) && Objects.equals(pessoa, pedidos.pessoa) && Objects.equals(dataPedido, pedidos.dataPedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pessoa, dataPedido);
    }
}
