package com.unievangelica.arqsoftware.arquitetura.controllers;

import java.util.List;

import com.unievangelica.arqsoftware.arquitetura.entitys.PessoaEntity;
import com.unievangelica.arqsoftware.arquitetura.services.PessoaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{error: 'message'}");
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaEntity> findOne(@PathVariable(name = "id") long id) {
        return new ResponseEntity<>(pessoaService.findOne(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PessoaEntity> save(@RequestBody PessoaEntity pessoa) {
        return new ResponseEntity<>(pessoaService.save(pessoa), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PessoaEntity> update(@RequestBody PessoaEntity pessoa) {
        return new ResponseEntity<>(pessoaService.save(pessoa), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(name = "id") long id) {
        return new ResponseEntity<>(pessoaService.delete(id), HttpStatus.OK);
    }
}