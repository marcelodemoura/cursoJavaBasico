package com.projeto.cursoNA.projeto.curso.NA.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrdemStatus {

    int esperandoPagamento;
    int pago;
    int enviado;
    int devolvido;
    int cancelado;


}
