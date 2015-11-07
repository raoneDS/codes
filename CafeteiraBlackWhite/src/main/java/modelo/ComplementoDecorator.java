/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 20131BSI0300
 */
abstract public class ComplementoDecorator {
    protected String nome;
    protected double valor;
    //protected Bebida bebida;
    
    public ComplementoDecorator(String nome, double valor, Bebida bebida){
        this.nome = nome;
        this.valor = valor;
        bebida.setComplemento(this);
        bebida.setPreco(valor);
    }
    
    public double getPreco(){
        return this.valor;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
}
