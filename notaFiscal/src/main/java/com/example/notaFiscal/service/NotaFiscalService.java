package com.example.notaFiscal.service;

import com.example.notaFiscal.domain.NotaFiscalRequest;
import com.example.notaFiscal.producer.NotaFiscalProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {

    private final NotaFiscalProducer producer;

    public void sendMessage(NotaFiscalRequest request){
        producer.sendMessage(request);
    }



}
