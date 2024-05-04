package com.cursojava.cursoNelioAlves.basico.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class LogicaProgamacaowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
//        while (x!= 0) {
//            x = scanner.nextInt();
//        }
        int soma = 0;
        while (x!= 0) {
            soma = soma + x;
            x = scanner.nextInt();
            System.out.println(soma);
        }
        scanner.close();
    }
}

