package com.produtos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.api.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
