package com.projeto.cursoNA.projeto.curso.NA.Model;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Ordem {


    @Id
    Integer Id;
    Date momento;
//    OrderStatus ordemStatus;

}
