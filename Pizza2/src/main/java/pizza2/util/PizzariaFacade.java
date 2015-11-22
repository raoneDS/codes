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
public class PizzariaFacade{
    private PizzaBuilderPesoMosca cardapio;
    private PizzaBuilder pedido;
    private PizzariaDirector cozinheiro;
    
    public PizzariaFacade(){
        this.cardapio = new PizzaBuilderPesoMosca();
    }
    
    public Pizza fazerPedido(String tipoPizza, String tipoMassa){
        pedido = cardapio.getBuilder(tipoPizza);
        cozinheiro = new PizzariaDirector(pedido);
        return cozinheiro.fazerPizza(tipoMassa); 
    }
}
