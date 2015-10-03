/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.FactoryBebida;

/**
 *
 * @author Raone
 */
public class Application {
    static final int CAFE = 1;
    static final int DESCAFEINADO = 2;
    static final int CAPUCCINO = 3;
    public static void main(String [ ] args){
        
        FactoryBebida pedido1 = new FactoryBebida(CAFE);
        FactoryBebida pedido2 = new FactoryBebida(DESCAFEINADO);
        FactoryBebida pedido3 = new FactoryBebida(CAPUCCINO);
    }
}
