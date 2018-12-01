package br.com.andremoresco.produto.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProdutoRepository {

    public Map<String, Object> create(Map<String, Object> produto) {
        Map<String, Object> response = new HashMap<>();
        produto.put("id", 1);
        response.put("sucesso", true);
        response.put("produto", produto);
        return response;
    }

}
