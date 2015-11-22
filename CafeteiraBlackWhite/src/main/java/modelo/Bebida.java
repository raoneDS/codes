/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import modelo.Ingredientes.Agua;
import java.util.ArrayList;

/**
 *
 * @author Suporte
 */
abstract public class Bebida{
    
    protected String nome;
    protected ArrayList ingredientes;
    protected double preco;
    protected int qtdAgua = 100;
    
    public Bebida(){
        this.ingredientes = new ArrayList<>();
        
        // adiciona 100 ml de agua em todas as bebidas
        for(int k = 0; k<this.qtdAgua; k++){
            Agua agua = new Agua();
            this.ingredientes.add(agua);
        }
    }
    
    public void setPreco(double valor){
        this.preco += valor;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String toString(){
        return "Bebida selecionada: " + this.getNome() + ". Valor: " + this.getPreco();
    }
}