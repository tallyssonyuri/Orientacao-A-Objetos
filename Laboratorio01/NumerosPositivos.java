package com.mycompany.numerospostivos;

import java.util.Scanner;

public class NumerosPostivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contNumerosPositivos = 0;
        
                for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            int numero = entrada.nextInt();

            if (numero > 0) {
                contNumerosPositivos++;
            }
        }

        System.out.println("Voce digitou " + contNumerosPositivos + " numeros positivos.");
        
        entrada.close();
    }
}
