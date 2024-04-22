package com.consumo.notafiscal.consumer;

import com.consumo.notafiscal.domain.NotaFiscalRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotaFiscalConsumer {

    public static final String QUEUE_NAME = "mfel.nf.queue";

    @RabbitListener(queues = QUEUE_NAME)
    public void listener(Message message, NotaFiscalRequest request){
        log.info("Mensagem recebida: {}", request);
    }
}
