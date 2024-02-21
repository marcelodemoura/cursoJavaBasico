package com.projeto.cursoNA.projeto.curso.NA.Model;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Produto {


    @Id
    Integer Id;
    String name;
    String descricao;
    Double preco;
    Double ImgUrl;

}
