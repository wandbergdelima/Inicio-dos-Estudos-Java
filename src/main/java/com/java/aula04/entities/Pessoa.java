package com.java.aula04.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String telefone;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

}
