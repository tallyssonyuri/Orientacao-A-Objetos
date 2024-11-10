package com.mycompany.ordernartresnumeros;

import java.util.Scanner;
import java.util.Arrays;

public class OrdernarTresNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Digite o terceiro numero: ");
        int num3 = entrada.nextInt();
        
        int[] numeros = {num1, num2, num3};
                
        Arrays.sort(numeros);
         
        System.out.println("A ordem crescente e: "
                + numeros[0] + " | " 
                + numeros[1]+  " | "
                + numeros[2]);
        
        entrada.close();        
    }
}
