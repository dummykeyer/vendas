package com.example.demo.dto;

import java.time.LocalDate;

public record VendaResponse(
    Long id,
    LocalDate dataVenda,
    Double valorTotal,
    String cliente
) {}
