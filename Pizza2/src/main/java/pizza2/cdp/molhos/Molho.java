/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.cdp.molhos;
import pizza2.cdp.IngredienteDecorator;
import pizza2.cdp.Pizza;

/**
 *
 * @author Raone
 */
public class Molho extends IngredienteDecorator {
    public Molho(Pizza pizza){
        super(pizza);
        this.nome = "Molho de Tomate";
        this.valor = 3.00;
    }
}
