package br.com.andremoresco.produto.service;

import br.com.andremoresco.produto.repository.ProdutoRepository;
import br.com.andremoresco.produto.sender.FreteQueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProdutoService {

    @Autowired
    private FreteQueueSender freteQueueSender;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Object create(Map<String, Object> produto) {
        Map<String, Object> response = produtoRepository.create(produto);
        this.sendNewProductToFreteService(produto);
        return response;
    }

    private void sendNewProductToFreteService(Map<String, Object> produto) {
        freteQueueSender.send(produto);
    }

}