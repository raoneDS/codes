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

public abstract class Massa extends IngredienteDecorator{
    public Massa(Pizza pizza){
        super(pizza);
    }
}
