package com.mycompany.area;

// esse exercicio serve para entende como funcioan sobrecarga de metodos

/*
 * A sobrecarga de métodos permite que uma classe tenha mais de um método com o mesmo nome,
 * desde que esses métodos tenham assinaturas diferentes (ou seja, quantidades ou tipos de
 * parâmetros diferentes). Isso é útil para tornar o código mais intuitivo e flexível,
 * pois podemos chamar o mesmo método de formas diferentes dependendo do contexto.
 */

public class Area {
    
    // metodo para calcular a area do quadrado com um parametro
    public void calcularArea(int lado){
        double area = lado * lado;
        System.out.println("A area do quadrado e: " + area);
    }
    
    // metodo para calcular a area do retangulo com dois parametros
    public void calcularArea (double comprimento, double largura){
        double area = comprimento * largura;
        System.out.println("A area do retangulo e: "+ area);
    }
    
    public static void main (String[] args){
        Area area = new Area();
        
        area.calcularArea(5); // calculando area do quadrado
        
        area.calcularArea(6.0, 4.0); // calculando a area do retangulo
    }
}
