/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.Menu.CafeDescafeinado;
import modelo.Menu.CafeNormal;
import modelo.Menu.Cappuccino;
import view.ConfirmacaoPedido;

/**
 *
 * @author Suporte
 */

// 1 = CAFE, 2 = CAFE SEM CAFEINA, 3 = CAPUCCINO
public class FactoryBebida {
    public FactoryBebida(int id){
        ConfirmacaoPedido message = new ConfirmacaoPedido();
        message.ConfirmaPedido(id);
        if(id == 1){
            new CafeNormal();
        }else if(id == 2){
            new CafeDescafeinado();
        }else if(id == 3){
            new Cappuccino();
        }
        System.out.println("Cuidado, esta quente! :0");
    }
}