package com.projeto.cursoNA.projeto.curso.NA.Model;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Pagamento {

    @Id
    Integer Id;
    Date monemto;
}
