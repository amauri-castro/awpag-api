package com.algaworks.awpag.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Parcelamento {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    //@JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private String descricao;
    private BigDecimal valorTotal;
    private Integer quantidadeParcelas;
    private LocalDateTime dataCriacao;
}
