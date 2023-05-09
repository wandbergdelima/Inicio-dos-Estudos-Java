package com.java.aula03.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PessoaDTO {

    private Long idPessoa;
    private String nomePessoa;
    private Date alteradoEm;
    private Date cadastradoEm;

}
