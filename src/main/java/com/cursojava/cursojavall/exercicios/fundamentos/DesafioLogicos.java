package com.cursojava.cursojavall.exercicios.fundamentos;

import java.util.Scanner;

public class DesafioLogicos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean trabalha1 = false;
        boolean trabalha2 = false;
        if(trabalha1 && trabalha2){
            System.out.println("comprar TV 50' e tomar sorvete");
        }else if(trabalha1||trabalha2){
            System.out.println("comprar TV 32' e tomar sorvete");
        }else{
            System.out.println("Ficar em casa");
        }
//        System.out.println(trabalha1&&trabalha2);
    }
}
