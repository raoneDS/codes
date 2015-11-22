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
public abstract class Queijo extends IngredienteDecorator {
    public Queijo(Pizza pizza, String tipo){
        super(pizza);
        this.valor = 1.00;
        this.nome = tipo;
    }
}
