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
public class Chantili extends ComplementoDecorator {
    public Chantili(Bebida bebida){
        super(bebida);
        this.nome = "Chantili";
        this.preco = 1.00;
    }
}
