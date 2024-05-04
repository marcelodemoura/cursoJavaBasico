package com.cursojava.cursojava.leonardoLeitao.clinica.exercicios.fundamentos;

public class Exercicio1 {

    /*
    1. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
     */
    public static void main(String[] args) {
//        (°F = -32) * 5/9 =°C

        final double F = (32);
        final double C = 5.0 / 9.0;

        double Fg = 150;
        double Gc = (Fg - F) * C;

        System.out.println(" A conversão de " + Fg + " graus fahrenheit para graus celsios e de " + Gc + " c°");


    }
}
