/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.util;
import pizza2.cdp.recheios.*;

/**
 *
 * @author Raone
 */
public class PizzaMussarelaBuilder extends PizzaBuilder{

    @Override
    public void criaRecheio(){       
        pizza = new Mussarela(pizza);
        pizza = new Gorgonzola(pizza);
        pizza = new Cebola(pizza);
        pizza = new Presunto(pizza);
    }    
}
