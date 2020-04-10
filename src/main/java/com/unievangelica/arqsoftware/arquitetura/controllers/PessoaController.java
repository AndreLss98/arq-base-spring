package com.unievangelica.arqsoftware.arquitetura.controllers;

import java.util.List;

import com.unievangelica.arqsoftware.arquitetura.entitys.PessoaEntity;
import com.unievangelica.arqsoftware.arquitetura.services.PessoaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public List<PessoaEntity> findAll() {
        return pessoaService.findAll();
    }

    @GetMapping("/{id}")
    public PessoaEntity findOne(@PathVariable(name = "id") long id) {
        return pessoaService.findOne(id);
    }

    @PostMapping
    public PessoaEntity save(@RequestBody PessoaEntity pessoa) {
        return pessoaService.save(pessoa);
    }

    @PutMapping("/{id}")
    public PessoaEntity update(@RequestBody PessoaEntity pessoa) {
        return pessoaService.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable(name = "id") long id) {
        return pessoaService.delete(id);
    }
}