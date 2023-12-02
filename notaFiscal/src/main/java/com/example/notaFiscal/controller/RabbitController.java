package com.example.notaFiscal.controller;

import com.example.notaFiscal.domain.NotaFiscalRequest;
import com.example.notaFiscal.service.NotaFiscalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/rabbit")
public class RabbitController {
    private final NotaFiscalService service;

    @PostMapping
    public void sendMessage(@RequestBody NotaFiscalRequest request){
        log.info("Nota Fiscal: {}", request);
        service.sendMessage(request);
    }

}
