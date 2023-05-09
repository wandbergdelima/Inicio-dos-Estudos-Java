package com.java.aula03.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EnderecoDTO {

    private Long id;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;

}
