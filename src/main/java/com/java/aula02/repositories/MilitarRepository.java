package com.java.aula02.repositories;

import com.java.aula02.models.Militar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilitarRepository extends JpaRepository<Militar, Integer> {

}