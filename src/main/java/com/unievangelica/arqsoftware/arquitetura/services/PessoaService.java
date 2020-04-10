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
        return pessoaRepository.findAll();
    }

    public PessoaEntity findOne(long id) {
        return pessoaRepository.findById(id);
    }

    public PessoaEntity save(PessoaEntity pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public PessoaEntity update(PessoaEntity pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Boolean delete(long id) {
        return pessoaRepository.deleteById(id);
    }
}