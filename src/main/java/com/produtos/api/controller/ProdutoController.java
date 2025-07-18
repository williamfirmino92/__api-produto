package com.produtos.api.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.produtos.api.model.DadosCadastroProduto;
import com.produtos.api.model.Produto;
import com.produtos.api.model.ProdutoRepository;

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
