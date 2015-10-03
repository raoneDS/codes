/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.Application;
import java.lang.System;

/**
 *
 * @author Raone
 */
public class ConfirmacaoPedido {
    
    public void ConfirmaPedido(int id){
        if (id == 1)
            System.out.println("... PREPARANDO CAFÉ ...");
        else if(id == 2)
            System.out.println("... PREPARANDO CAFÉ DESCAFEÍNADO ...");
        else if(id == 3)
            System.out.println("... PREPARANDO CAPPUCCINO ...");
    }
}
