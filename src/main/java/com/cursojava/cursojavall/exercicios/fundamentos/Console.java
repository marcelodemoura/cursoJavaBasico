package com.cursojava.cursojavall.exercicios.fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("digite uma frase");
        String nome = scanner.nextLine();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome +" e sua idade " + idade);


    }
}
