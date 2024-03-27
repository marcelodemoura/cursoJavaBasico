package com.projeto.cursoNA.projeto.curso.NA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class OrdemItem {
    @Id
    private String quantidade;
    private Double preco;
    private double subtotal;



}
