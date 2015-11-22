/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.cdp.recheios;
import pizza2.cdp.IngredienteDecorator;
import pizza2.cdp.Pizza;

/**
 *
 * @author Raone
 */
public class Cebola extends IngredienteDecorator{
    public Cebola(Pizza pizza){
        super(pizza);
        this.nome =  "Cebola";
        this.valor = 3.00;
    }
}
