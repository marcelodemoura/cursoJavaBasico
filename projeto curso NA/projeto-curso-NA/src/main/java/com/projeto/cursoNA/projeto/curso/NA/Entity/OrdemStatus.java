package com.projeto.cursoNA.projeto.curso.NA.Entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class OrdemStatus {

    int esperandoPagamento;
    int pago;
    int enviado;
    int devolvido;
    int cancelado;


}
