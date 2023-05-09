package com.java.aula03.entities;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pessoa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nome;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_insercao")
    private Date dataInsercao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_alteracao")
    private Date dataAlteracao;

    @PrePersist
    private void prePersist(){
        this.dataInsercao = new Date();
    }
    @PreUpdate
    private void preUpdate(){
        this.dataAlteracao = new Date();
    }
}
