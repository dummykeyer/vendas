package com.example.demo.entity;

import jakarta.persistence.*;
    import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "vendas")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_venda")
    private LocalDate dataVenda;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "cliente")
    private String cliente;

    public Venda() {}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public LocalDate getDataVenda() { return dataVenda; }
    public void setDataVenda(LocalDate dataVenda) { this.dataVenda = dataVenda; }

    public Double getValorTotal() { return valorTotal; }
    public void setValorTotal(Double valorTotal) { this.valorTotal = valorTotal; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venda other)) return false;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}
