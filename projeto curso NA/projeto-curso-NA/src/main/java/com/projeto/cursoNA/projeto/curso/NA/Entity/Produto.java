package com.projeto.cursoNA.projeto.curso.NA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor

@Entity
public class Produto implements Serializable {
    private final long serialVersionUID = 1L;


    @Id
    Long Id;
    String name;
    String descricao;
    Double preco;
    Double ImgUrl;

}
