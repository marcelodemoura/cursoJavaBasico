package com.projeto.cursoNA.projeto.curso.NA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Pagamento {

    @Id
    Long Id;
    Date momento;
}