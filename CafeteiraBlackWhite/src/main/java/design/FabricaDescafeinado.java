/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.util.ArrayList;
import modelo.Cafe;
import modelo.Ingredientes.*;
import modelo.Menu.CafeDescafeinado;

/**
 *
 * @author Suporte
 */
public class FabricaDescafeinado extends FabricaCafe{

    @Override
    public Cafe criaCafe() {
        CafeDescafeinado cafe = new CafeDescafeinado();
        return cafe;
    }
    
    @Override
    public ArrayList inseriSoluvel() {
       ArrayList<SoluvelDescafeinado> vetor = new ArrayList<>();
       for(k=0;k<this.qtdPo;k++){
           SoluvelDescafeinado po = new SoluvelDescafeinado();
           vetor.add(po);
       }
       return vetor;
    }
}
