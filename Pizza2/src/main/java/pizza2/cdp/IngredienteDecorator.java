/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.cdp;


/**
 *
 * @author 20131BSI0300
 */
abstract public class IngredienteDecorator extends Pizza{
    private final Pizza pizza;
    
    public IngredienteDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public double getValor(){
        return pizza.getValor()+valor;
    }
    
    @Override
    public String getNome() {
        return pizza.getNome()+","+nome;
    }
}
