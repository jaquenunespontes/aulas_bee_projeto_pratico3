package com.ambev.projetopratico3.service;
import com.ambev.projetopratico3.model.Produto;
import com.ambev.projetopratico3.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }



    public Optional<Produto> findById(String id) {
        return produtoRepository.findById(id);

    }

    public List<Produto> consultarPorNome(String nome) {
        return produtoRepository.findByNome(nome);
    }

    // Outros métodos de serviço, como buscar, atualizar e excluir produtos
}
