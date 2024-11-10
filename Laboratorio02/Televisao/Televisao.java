package com.mycompany.televisao;

public class Televisao {
    
    // Declaracao dos atributos     
    private String modelo;
    private float preco;
    private float tamanho;
    private int volume;
    private int canal;
    private boolean ligada;
    
    // Métodos get e set
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }
   
    public float getPreco(){
        return preco;
    }
    
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    
    public float getTamanho(){
        return tamanho;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public int getCanal(){
        return canal;
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    
    public boolean isLigada(){ // is e o prefixo utilizado para booleanos ao inves de get
        return ligada;
    }
    
    // Outros metodos
    public void alteraVolume(int valor){
        volume += valor;
        
        if (volume < 0) {
            volume = 0; // para garantir que o volume não seja negativo
        }
    }
    
    public void alteraCanal(int valor){
        canal += valor;
        
        if (canal < 1) {
            canal = 1;
        }
    }
}
