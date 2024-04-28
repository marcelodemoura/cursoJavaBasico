package com.cursojava.cursoNelioAlves.basico.exercicios;

import com.cursojava.cursoNelioAlves.basico.poo.retangulo.Retangulo;

import java.util.Scanner;

public class LogicaProgamacaoCOORetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Retangulo r = new Retangulo();

        System.out.println("Informe a medida do lado a");
        r.a = scanner.nextDouble();
        System.out.println("Informe a medida do lado b");
        r.b = scanner.nextDouble();

        System.out.println("#########################################################");


        System.out.printf("Retangulo x area: %2f%n", r.area());
        System.out.printf("PERIMETRO x area: %2f%n", r.perimetro());
        System.out.printf("dIAGONAL x area: %2f%n", r.diagonal());



        scanner.close();


    }
}

