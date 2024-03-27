package com.projeto.cursoNA.projeto.curso.NA.Entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
public enum OrdemStatus {

    esperandoPagamento,
    pago,
    enviado,
    devolvido,
    cancelado;


}
