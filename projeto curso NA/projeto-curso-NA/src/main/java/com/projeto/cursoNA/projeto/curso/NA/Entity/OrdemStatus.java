package com.projeto.cursoNA.projeto.curso.NA.Entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;



public enum OrdemStatus {

    esperandoPagamento,
    pago,
    enviado,
    devolvido,
    cancelado;


}
