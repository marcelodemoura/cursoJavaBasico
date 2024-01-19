package com.cursojava.cursojava.cursoNelioAlves.basico;

import java.util.Scanner;

public class LogicaProgamacaoExe7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minutos = scanner.nextInt();

        double plano = 50.0;
        if (minutos > 100) {
            plano = plano + (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta será R$ %.2f%n", plano);

        scanner.close();
    }
}

