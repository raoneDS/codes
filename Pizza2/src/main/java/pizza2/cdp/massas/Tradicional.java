/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.cdp.massas;

import pizza2.cdp.Massa;
import pizza2.cdp.Pizza;

/**
 *
 * @author Raone
 */
public class Tradicional extends Massa {
    public Tradicional(Pizza pizza){
        super(pizza);
        this.nome = "Tradicional";
        this.valor = 5.00;
    }
}
