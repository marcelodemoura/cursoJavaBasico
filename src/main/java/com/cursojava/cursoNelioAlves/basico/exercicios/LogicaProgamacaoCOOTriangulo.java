package com.cursojava.cursoNelioAlves.basico.exercicios;

import com.cursojava.cursoNelioAlves.basico.entities.Triangulo;

import java.util.Scanner;

public class LogicaProgamacaoCOOTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Informe a medida do triangulo xa");
        x.a = scanner.nextDouble();
        System.out.println("Informe a medida do triangulo xb");
        x.b = scanner.nextDouble();
        System.out.println("Informe a medida do triangulo xc");
        x.c = scanner.nextDouble();

        System.out.println("#########################################################");

        System.out.println("Informe a medida do triangulo ya");
        y.a = scanner.nextDouble();
        System.out.println("Informe a medida do triangulo yb");
        y.b = scanner.nextDouble();
        System.out.println("Informe a medida do triangulo yc");
        y.c = scanner.nextDouble();


        double areaX = x.area();


        double areaY = y.area();

        System.out.printf("Triangulo x area: %2f%n", areaX);
        System.out.printf("Triangulo y area: %2f%n", areaY);


        y.c = scanner.nextDouble();

        scanner.close();


    }
}

