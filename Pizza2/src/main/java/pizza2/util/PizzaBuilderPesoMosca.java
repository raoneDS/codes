/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza2.util;
import java.util.ArrayList;


/**
 *
 * @author Raone
 */
public class PizzaBuilderPesoMosca{
    
    private ArrayList<PizzaBuilder> builders;
    
    public PizzaBuilderPesoMosca(){
        this.builders = new ArrayList<>();
        builders.add(new PizzaMussarelaBuilder());
        builders.add(new PizzaQuatroQueijosBuilder());
    }
    
    public PizzaBuilder getBuilder(String tipoPizza){
        if(tipoPizza.equals("Mussarela"))
            return builders.get(0);
        else
            return builders.get(1);
    }
}
