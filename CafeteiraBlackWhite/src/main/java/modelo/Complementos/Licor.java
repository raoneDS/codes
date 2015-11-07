/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Complementos;

import modelo.Bebida;
import modelo.ComplementoDecorator;

/**
 *
 * @author 20131BSI0300
 */
public class Licor extends ComplementoDecorator {
    public Licor(Bebida bebida){
        super("Licor",2.50, bebida);
    }
}
