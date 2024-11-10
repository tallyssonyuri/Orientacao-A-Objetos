package com.mycompany.televisao;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        // Dois objeitos do tipo televisao
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        
        // Recebe o valor dos atributos para os objetos tv1 e tv2
        System.out.println("Digite o modelo da TV1:");
        tv1.setModelo(scanner.nextLine());  

        System.out.println("Digite o preço da TV1:");
        tv1.setPreco(scanner.nextFloat()); 

        System.out.println("Digite o tamanho da TV1:");
        tv1.setTamanho(scanner.nextFloat()); 

        System.out.println("Digite o volume inicial da TV1:");
        tv1.setVolume(scanner.nextInt()); 

        System.out.println("Digite o canal inicial da TV1:");
        tv1.setCanal(scanner.nextInt()); 

        // Limpa o buffer de entrada
        scanner.nextLine(); 

       
        System.out.println("Digite o modelo da TV2:");
        tv2.setModelo(scanner.nextLine());  

        System.out.println("Digite o preço da TV2:");
        tv2.setPreco(scanner.nextFloat());  

        System.out.println("Digite o tamanho da TV2:");
        tv2.setTamanho(scanner.nextFloat());

        System.out.println("Digite o volume inicial da TV2:");
        tv2.setVolume(scanner.nextInt()); 

        System.out.println("Digite o canal inicial da TV2:");
        tv2.setCanal(scanner.nextInt()); 

        // Limpa o buffer do scanner
        scanner.nextLine();

        // Exibe o valor dos atributos dos objetos
        System.out.println("\nInformacoes da TV1:");
        System.out.println("Modelo: " + tv1.getModelo());
        System.out.println("Preco: " + tv1.getPreco());
        System.out.println("Tamanho: " + tv1.getTamanho());
        System.out.println("Volume: " + tv1.getVolume());
        System.out.println("Canal: " + tv1.getCanal());

        System.out.println("\nInformacoes da TV2:");
        System.out.println("Modelo: " + tv2.getModelo());
        System.out.println("Preco: " + tv2.getPreco());
        System.out.println("Tamanho: " + tv2.getTamanho());
        System.out.println("Volume: " + tv2.getVolume());
        System.out.println("Canal: " + tv2.getCanal());

        // Metodos para alterar o volume dos objetos
        tv1.alteraVolume(5);  // Aumenta o volume de tv1
        tv2.alteraVolume(-3); // Diminui o volume de tv2

        tv1.alteraCanal(2);    // Aumenta o canal de tv1
        tv2.alteraCanal(6);    // Aumenta o canal de tv2

        System.out.println("\nDepois da alteração:");
        System.out.println("Volume da TV1: " + tv1.getVolume() + ", Canal da TV1: " + tv1.getCanal());
        System.out.println("Volume da TV2: " + tv2.getVolume() + ", Canal da TV2: " + tv2.getCanal());

        // Desliga a TV
        tv2.setLigada(false); 
        System.out.println("\nA TV2 foi desligada. Estado: " + (tv2.isLigada() ? "Ligada" : "Desligada"));

        scanner.close();
    }
}
