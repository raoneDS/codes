/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.util.ArrayList;
import modelo.Cafe;
import modelo.Ingredientes.*;
import modelo.Menu.CafeNormal;

/**
 *
 * @author Suporte
 */
public class FabricaCafeNormal extends FabricaCafe{
   
    protected int k;

    @Override
    public Cafe criaCafe() {
        CafeNormal cafe = new CafeNormal();
        return cafe;
    }
    
    @Override
    public ArrayList inseriSoluvel() {
       ArrayList<SoluvelComum> vetor = new ArrayList<>();
       for(k=0;k<this.qtdPo;k++){
           SoluvelComum po = new SoluvelComum();
           vetor.add(po);
       }
       return vetor;
    }
    
}
