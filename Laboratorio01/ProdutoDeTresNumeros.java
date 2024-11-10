package com.mycompany.produtodetresnumeros;

import java.util.Scanner;

public class ProdutoDeTresNumeros {
    public static void main (String[] args){
        
        // Cria um objeto para ler as entradas do usuário
        Scanner entrada = new Scanner(System.in);
        
        // Enviando a mensangem para solicitação das entradas
        System.out.print("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();
        
        System.out.print("Digite o terceiro numero: ");
        double num3 = entrada.nextDouble();
        
        double resultado = num1 * num2 * num3;
        
        System.out.println("O resultado e: " + resultado);
        
        entrada.close();
    }
}
