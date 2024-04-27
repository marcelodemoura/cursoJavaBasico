package com.cursojava.cursoNelioAlves.basico.compras;

import com.cursojava.cursoNelioAlves.basico.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Insira os dado do produto");
        System.out.println("nome");
        product.name = scanner.nextLine();

        System.out.println("Insira o preco do produto");
        System.out.println("Preço");
        product.price = scanner.nextDouble();

        System.out.println("Insira o quantidade de produtos");
        System.out.println("Quantidade");
        product.quantity = scanner.nextInt();

        System.out.println(product );
        System.out.println("Insira o numero de produtos a serem inseridos no estoque");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

//      System.out.println(product.name + ", $ " + product.price + ", " + product.quantity + " unidades, Total: $" + product.quantity * product.price);
        System.out.println("Quantidade atualizada de produtos");


        System.out.println(product );
        System.out.println("Insira o numero de produtos a serem removidos no estoque");
        int quantities = scanner.nextInt();
        product.removeProducts(quantities);
        System.out.println(product );












        scanner.close();





    }
}
