/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.cdp;

/**
 *
 * @author Raone
 */
public class Pizza {
    protected String nome;
    protected double valor;    
    
    public String getNome(){
        return nome;
    }
    
    @Override
    public String toString() {
        return "Ingredientes: "+this.getNome()+". Valor: "+this.getValor();
    }
    
    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor += valor;
    }
}
