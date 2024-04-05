package com.cursojava.cursojava.cursoNelioAlves.basico.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class LogicaProgamacaoExe3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = scanner.next();
        y = scanner.nextInt();
        z = scanner.nextDouble();
        System.out.println("Digite dados");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        scanner.close();

    }

}
