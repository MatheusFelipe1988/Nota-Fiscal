package com.example.notaFiscal.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class NotaFiscalRequest {

    private long id;
    private String numero;
    private BigDecimal valor;
    private LocalDate data;

}
