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
public class Cone extends Massa {
    public Cone(Pizza pizza){
        super(pizza);
        this.nome = "Cone";
        this.valor = 10.00;
    }  
}
