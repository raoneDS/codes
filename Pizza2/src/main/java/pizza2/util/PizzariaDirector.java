/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.util;

import pizza2.cdp.Pizza;

/**
 *
 * @author Raone
 */
public class PizzariaDirector {
    private final PizzaBuilder cozinheiroBuilder;
    
    public PizzariaDirector(PizzaBuilder tipoPizza){
        this.cozinheiroBuilder = tipoPizza;
    }

    public Pizza fazerPizza(String tipoMassa){
        cozinheiroBuilder.criaPizza();
        cozinheiroBuilder.criaMassa(tipoMassa);
        cozinheiroBuilder.criaMolho();
        cozinheiroBuilder.criaRecheio();
        return cozinheiroBuilder.entregarPizza();
    }
}
