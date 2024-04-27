package com.cursojava.cursoNelioAlves.basico.exercicios;

import java.util.Scanner;


public class LogicaProgamacaoFuncoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite três numeros");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = max(a, b, c);

        showResult(maior);

//        if (a > b && a > c){
//            System.out.println("Maior é" + a);
//        } else if (b > c) {
//            System.out.println("Maior é" + b);
//        }
//        else {
//            System.out.println("Maior é" + c);

        scanner.close();
    }

    public static int max(int x, int y, int z) {
        int aux;

        if (x > y && x > z) {
            aux = x;

        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("maior = " + value);

    }
}

