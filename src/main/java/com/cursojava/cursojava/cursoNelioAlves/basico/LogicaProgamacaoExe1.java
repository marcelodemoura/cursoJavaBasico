package com.cursojava.cursojava.cursoNelioAlves.basico;

public class LogicaProgamacaoExe1 {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        double z = 10.35785;
        String nome = "Maria";
        int idade = 31;
        double renda = 4_000.0;
        String produto1 = "computador";
        String produto2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n",z);
        System.out.printf("%.4f%n",z);
        System.out.println("Bom dia! ");
        System.out.printf("Resultado = %.2f metros%n",x);
        System.out.printf("\n","%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
        System.out.println("Prducts:");
        System.out.printf("%s, which price is $ %.2f", produto1, prince1);
        System.out.printf("\n%s,  which price is $ %.2f ", produto2, prince2);
        System.out.printf("\n\nRecord: = %d years old, code %d and gender: ", age, code,gender);
        System.out.printf("\n\nMeasure with eigth decimal places: %.8f ", measure);
        System.out.printf("\nRounded(three decimal places):%.3f", measure);
        System.out.printf("\nUS decimal point: %.3f", measure);

    }
}
