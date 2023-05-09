package com.java.aula03.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "logradouro", length = 50, nullable = false)
    private String logradouro;

    @Column(name = "bairro", length = 40, nullable = false)
    private String bairro;

    @Column(name ="cidade", length = 30, nullable = false)
    private String cidade;

    @Column(name = "uf",length = 3, nullable = false)
    private String uf;

}
