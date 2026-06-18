package com.example.demo.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record VendaRequest(
    @NotNull
    LocalDate dataVenda,
    @NotNull
    Double valorTotal,
    @NotBlank
    String cliente
) {}
