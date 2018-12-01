package br.com.andremoresco.frete.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FreteConsumer {

    @RabbitListener(queues = "${queue.frete.name}")
    public void receive(@Payload Map<String, Object> produto) throws Exception {
        System.out.println(produto.toString());
    }

}
