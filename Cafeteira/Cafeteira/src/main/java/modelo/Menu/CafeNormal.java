/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Menu;

import modelo.Cafe;
import modelo.Ingredientes.Soluvel;

/**
 *
 * @author Suporte
 */
public class CafeNormal extends Cafe{
    public CafeNormal(){
        super(2.00);
        for(int k=0; k < this.qtdPo; k++){
            Soluvel cafe = new Soluvel();
            this.ingredientes.add(cafe);
        }
    }
}
