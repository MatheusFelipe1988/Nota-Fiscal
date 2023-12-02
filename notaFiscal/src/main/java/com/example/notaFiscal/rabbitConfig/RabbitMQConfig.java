package com.example.notaFiscal.rabbitConfig;

/*
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;

@Configuration
public class RabbitMQConfig {

    @Value("${broker.queue.nf}")
    private String queue;

    @Bean
    public Queue queue(){
        return new Queue(queue, true);
    }

    @Bean
    public MessageConverter jsonMessageConverter(){
        final ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return (MessageConverter) new Jackson2JsonMessageConverter(mapper);
    }
}
*/