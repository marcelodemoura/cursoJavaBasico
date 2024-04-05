package com.cursojava.cursojava.cursoNelioAlves.basico.exercicios;

import java.util.Scanner;

public class LogicaProgamacaoExe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco = 400.00;
        double desconto = 0;

        if (preco < 200.00) {
            desconto = preco * 0.1;
        } else {
        }
        System.out.println(desconto);


        scanner.close();
    }
}

