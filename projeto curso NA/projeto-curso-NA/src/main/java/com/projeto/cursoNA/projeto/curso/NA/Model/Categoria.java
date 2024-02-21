package com.projeto.cursoNA.projeto.curso.NA.Model;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Categoria {

    @Id
    Integer id;
    String name;




}
