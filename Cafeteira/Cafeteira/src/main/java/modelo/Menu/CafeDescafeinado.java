/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Menu;

import modelo.Cafe;
import modelo.Ingredientes.SoluvelDescafeinado;

/**
 *
 * @author Suporte
 */
public class CafeDescafeinado extends Cafe{
    public CafeDescafeinado(){
        super(3.00);
        for(int k=0; k< this.qtdPo; k++){
            SoluvelDescafeinado cafe = new SoluvelDescafeinado();
            this.ingredientes.add(cafe);
        }
    }
    
}
