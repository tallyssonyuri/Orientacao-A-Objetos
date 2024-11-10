package com.mycompany.retangulo;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();

        System.out.println("Digite o valor do lado1 para ret1:");
        ret1.setLado1(scanner.nextInt());
        System.out.println("Digite o valor do lado2 para ret1:");
        ret1.setLado2(scanner.nextInt());

        System.out.println("Digite o valor do lado1 para ret2:");
        ret2.setLado1(scanner.nextInt());
        System.out.println("Digite o valor do lado2 para ret2:");
        ret2.setLado2(scanner.nextInt());

        System.out.println("\nAtributos do retângulo ret1:");
        System.out.println("Lado1: " + ret1.getLado1());
        System.out.println("Lado2: " + ret1.getLado2());
        System.out.println("Área de ret1: " + ret1.area());
        System.out.println("Perímetro de ret1: " + ret1.perimetro());

        System.out.println("\nAtributos do retângulo ret2:");
        System.out.println("Lado1: " + ret2.getLado1());
        System.out.println("Lado2: " + ret2.getLado2());
        System.out.println("Área de ret2: " + ret2.area());
        System.out.println("Perímetro de ret2: " + ret2.perimetro());

        scanner.close();
    }
}
