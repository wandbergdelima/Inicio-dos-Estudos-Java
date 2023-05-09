package com.java.aula04.repositories;

import com.java.aula04.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    //JPQL
    @Query("select e from Endereco e where e.cep =:cep")
    Endereco buscarPorCep(@Param("cep") String cep);
}
