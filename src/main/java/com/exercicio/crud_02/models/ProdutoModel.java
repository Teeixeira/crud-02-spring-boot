package com.exercicio.crud_02.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tp_produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descritivo")
    private String nome;
    @Column(name = "preco")
    private BigDecimal preco;
    private Integer estoque;
}
