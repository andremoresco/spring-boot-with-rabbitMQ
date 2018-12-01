package br.com.andremoresco.produto;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProdutoApplication {

	@Value("${queue.frete.name}")
	private String freteQueue;

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApplication.class, args);
	}

	@Bean
	public Queue queue() {
		return new Queue(freteQueue, true);
	}
}
