package com.cursojava.cursojava.cursoNelioAlves.basico;

import java.util.Scanner;

public class LogicaProgamacaoExe6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas");
        hora = scanner.nextInt();
        if (hora > 5 && hora <= 12) {
            System.out.println("Bom dia! " + hora + ":00 horas");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa tarde! " + hora + ":00 horas");
        } else if (hora > 18 && hora <=24) {
            System.out.println("Boa Noite! " + hora + ":00 horas");
        } else {
            System.out.println("Vá dormir que ja e madrugada! Horario entre 00:00 e 04:59");
        }
    }
}
