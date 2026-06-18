package com.example.demo.controller;

import com.example.demo.dto.VendaRequest;
import com.example.demo.dto.VendaResponse;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.VendaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(VendaController.class)
class VendaControllerTest {

    @Autowired private MockMvc mockMvc;
    @Autowired private ObjectMapper objectMapper;

    @MockitoBean private VendaService vendaService;

    @Test
    void create_returns201() throws Exception {
        VendaRequest request = new VendaRequest(null, 1.0, "sample");
        VendaResponse response = new VendaResponse(1L, null, 1.0, "sample");

        when(vendaService.create(any())).thenReturn(response);

        mockMvc.perform(post("/api/vendas")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.id").value(1));
    }

    @Test
    void findById_whenMissing_returns404() throws Exception {
        when(vendaService.findById(eq(99L)))
            .thenThrow(new ResourceNotFoundException("not found"));

        mockMvc.perform(get("/api/vendas/99"))
            .andExpect(status().isNotFound());
    }
}
