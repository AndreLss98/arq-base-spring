package com.unievangelica.arqsoftware.arquitetura.services;

import java.util.List;

import com.unievangelica.arqsoftware.arquitetura.entitys.PessoaEntity;
import com.unievangelica.arqsoftware.arquitetura.repositorys.PessoaRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<PessoaEntity> findAll() {
        return null;
    }

    public PessoaEntity findOne(long id) {
        return null;
    }

    public PessoaEntity save(PessoaEntity pessoa) {
        return null;
    }

    public PessoaEntity update(PessoaEntity pessoa) {
        return null;
    }

    public Boolean delete(long id) {
        return false;
    }
}