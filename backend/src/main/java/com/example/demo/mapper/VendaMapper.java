package com.example.demo.mapper;

import com.example.demo.dto.VendaRequest;
import com.example.demo.dto.VendaResponse;
import com.example.demo.entity.Venda;
import org.springframework.stereotype.Component;

@Component
public class VendaMapper {

    public Venda toEntity(VendaRequest request) {
        Venda entity = new Venda();
        entity.setDataVenda(request.dataVenda());
        entity.setValorTotal(request.valorTotal());
        entity.setCliente(request.cliente());
        return entity;
    }

    public VendaResponse toResponse(Venda entity) {
        return new VendaResponse(
            entity.getId(),
            entity.getDataVenda(),
            entity.getValorTotal(),
            entity.getCliente()
        );
    }

    public void updateEntity(Venda entity, VendaRequest request) {
        entity.setDataVenda(request.dataVenda());
        entity.setValorTotal(request.valorTotal());
        entity.setCliente(request.cliente());
    }
}
