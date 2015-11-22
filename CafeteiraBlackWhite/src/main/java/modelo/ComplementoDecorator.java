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
abstract public class ComplementoDecorator extends Bebida{
    private Bebida bebida;
    
    public ComplementoDecorator(Bebida bebida){
        this.bebida = bebida;
    }    
    @Override
    public String getNome() {
        return bebida.nome + " + " + nome;
    }
    
    @Override
    public double getPreco(){
        return bebida.preco+preco;
    }
}
