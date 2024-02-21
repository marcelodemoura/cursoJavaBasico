package com.projeto.cursoNA.projeto.curso.NA.Model;

import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Usuario {
    @Id
    Integer id;
    String name;
    @Email
    String email;
    String celular;
    String senha;

}
