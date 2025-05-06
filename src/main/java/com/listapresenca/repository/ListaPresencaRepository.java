package com.listapresenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listapresenca.entity.ListaPresenca;

@Repository
public interface ListaPresencaRepository extends JpaRepository<ListaPresenca, Long> {

}
