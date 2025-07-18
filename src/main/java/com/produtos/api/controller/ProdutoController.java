package com.produtos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.produtos.api.dto.DadosCadastroProduto;
import com.produtos.api.entity.Produto;
import com.produtos.api.repository.ProdutoRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/listar")
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = repository.findAll();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping("/cadastrar")
    @Transactional
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody @Valid DadosCadastroProduto dados) {

        var produtoSalvo = repository.save(new Produto(dados));

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }

}
