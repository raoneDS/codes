/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.util;
import pizza2.cdp.Pizza;
import pizza2.cdp.massas.*;
import pizza2.cdp.molhos.Molho;

/**
 *
 * @author Raone
 */
public abstract class PizzaBuilder{
    protected Pizza pizza;
    
    //Cria recheio e o insere na pizza
    public abstract void criaRecheio();
    
    //Cria a massa e a insere na pizza
    public void criaMassa(String tipo){
        if(tipo.equals("Tradicional"))
            pizza = new Tradicional(pizza);
        else
            pizza = new Cone(pizza);      
    }
    
    //Cria molho e o insere na pizza
    public void criaMolho() {
       pizza = new Molho(pizza);
    }
    
    //Cria pizza com seu nome
    public void criaPizza(){
        pizza = new Pizza();
    }
    
    //Retorna a pizza montada para o cliente
    public Pizza entregarPizza(){
        return pizza;
    }
}
