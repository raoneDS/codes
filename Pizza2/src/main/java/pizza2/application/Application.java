/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.application;
import pizza2.cdp.*;
import pizza2.util.PizzariaFacade;

/**
 *
 * @author Raone
 */
public class Application {
    public static void main(String [] xxx){
        PizzariaFacade pizzaria = new PizzariaFacade();
        Pizza bandeja;
        bandeja = pizzaria.fazerPedido("Quatro Queijos", "Cone");
        System.out.println(bandeja);
    }
}
