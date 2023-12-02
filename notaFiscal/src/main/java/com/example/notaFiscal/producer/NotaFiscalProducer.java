package com.example.notaFiscal.producer;

import com.example.notaFiscal.domain.NotaFiscalRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import static com.example.notaFiscal.rabbitConfig.NotaFiscalRabbitConfig.ROUTING_KEY_NAME;
import static com.example.notaFiscal.rabbitConfig.NotaFiscalExchangeConfig.EXCHANGE_NAME;
@Component
@RequiredArgsConstructor
public class NotaFiscalProducer {

    private final RabbitTemplate template;

    public void sendMessage(NotaFiscalRequest request){
        template.convertAndSend(EXCHANGE_NAME,ROUTING_KEY_NAME);
    }

}
