package com.projeto.cursoNA.projeto.curso.NA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class Usuario implements Serializable {

    private final long serialVersionUID = 1L;

    @Id
    private Long id;
    private String name;
    @Email
    private String email;
    private String celular;
    private String senha;
}
