package com.cursojava.cursoNelioAlves.basico.exercicios;

import java.util.Scanner;

public class LogicaProgamacaoConversaoString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String original = "ASD asd YTREaaaaa AdASTTdYYuU" ;

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.replace('a','x');
        String s06 = original.substring(2,9);

        System.out.println("Original;" + original + "_");
        System.out.println("toLowerCase; -" + s01 + "_");
        System.out.println("toUpperCase; " + "-" + s02 + "_");
        System.out.println("trim; -" + s03 + "_");
        System.out.println("substring (2); -" + s04 + "_");
        System.out.println("substring (2,9); -" + s05 + "_");
        System.out.println("substring(2,9); -" + s06 + "_");

        scanner.close();
    }
}

