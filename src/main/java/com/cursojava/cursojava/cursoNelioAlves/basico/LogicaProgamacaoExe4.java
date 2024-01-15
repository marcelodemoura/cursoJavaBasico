package com.cursojava.cursojava.cursoNelioAlves.basico;

import java.util.Locale;
import java.util.Scanner;

public class LogicaProgamacaoExe4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String s1,s2,s3;



        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        scanner.close();

    }

}
