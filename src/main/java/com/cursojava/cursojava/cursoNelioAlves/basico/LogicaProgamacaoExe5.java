package com.cursojava.cursojava.cursoNelioAlves.basico;

import java.util.Locale;
import java.util.Scanner;

public class LogicaProgamacaoExe5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Double b,h, r;

        System.out.println("Medidas");

        System.out.println("\nBase ");
        b = scanner.nextDouble();

        System.out.println("Altura");
        h = scanner.nextDouble();

        System.out.println( b * h);

        scanner.close();

    }


}
