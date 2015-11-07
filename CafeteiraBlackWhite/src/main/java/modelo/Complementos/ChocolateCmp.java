/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Complementos;

import modelo.ComplementoDecorator;
import modelo.*;

/**
 *
 * @author 20131BSI0300
 */
public class ChocolateCmp extends ComplementoDecorator {
    public ChocolateCmp(Bebida bebida){
        super("Chocolate",0.50, bebida);
    }
}
