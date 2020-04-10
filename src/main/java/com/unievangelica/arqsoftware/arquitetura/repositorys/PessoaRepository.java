package com.unievangelica.arqsoftware.arquitetura.repositorys;

import com.unievangelica.arqsoftware.arquitetura.entitys.PessoaEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
    PessoaEntity findById(long id);
    void deleteById(long id);
}