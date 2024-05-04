package com.cursojava.cursoNelioAlves.basico.exercicios;

import java.util.Scanner;

public class LogicaProgamacaodoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resp = 's';

//        System.out.println("Informe a temperatura em Celsius");
//        double C = scanner.nextDouble();
//        double F = 9.0 * C / 5.0 + 32.0;
//        System.out.printf("Resultado em fahrenheit: %.1f%n",F);
//        System.out.println("Deseja Repetir (s/n)?");
//        char resp = scanner.next().charAt(0);

        while (resp != 'n'){
            System.out.println("Informe a temperatura em Celsius");
            double C = scanner.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Resultado em fahrenheit: %.1f%n",F);
            System.out.println("Deseja Repetir (s/n)?");
            resp = scanner.next().charAt(0);

        }

        scanner.close();
    }
}

