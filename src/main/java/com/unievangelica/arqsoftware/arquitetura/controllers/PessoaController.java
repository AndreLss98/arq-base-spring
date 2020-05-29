package com.unievangelica.arqsoftware.arquitetura.controllers;

import com.unievangelica.arqsoftware.arquitetura.core.CrudController;
import com.unievangelica.arqsoftware.arquitetura.entitys.PessoaEntity;

import com.unievangelica.arqsoftware.arquitetura.exceptions.DefaultException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController extends CrudController<PessoaEntity> {

    @Override
    @PostMapping
    public ResponseEntity<PessoaEntity> save(@RequestBody() PessoaEntity pessoa) {

        if (pessoa.getName() == "" || pessoa.getName() == null) {
            throw new DefaultException("Name is required");
        }

        return new ResponseEntity<>(service.save(pessoa), HttpStatus.OK);
    }
}