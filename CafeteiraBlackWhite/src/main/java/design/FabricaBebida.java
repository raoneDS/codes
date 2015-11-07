/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;
import modelo.Bebida;
import modelo.Cafe;
import modelo.Menu.*;

/**
 *
 * @author Suporte
 */
public class FabricaBebida {
    public Bebida fazerPedido(int idBebida){
        Bebida bebida = null;
        if(idBebida == 3){
            bebida = criaCappuccino();
        }else
            bebida = criaCafe(idBebida);
        //insereComplemento(bebida);
        return bebida;
    }
    
    private Cafe criaCafe(int idBebida){
        FabricaCafe fabrica = null;
        if(idBebida == 1){
            fabrica = new FabricaCafeNormal();
        }else if(idBebida == 2){
            fabrica = new FabricaDescafeinado();
        }
        Cafe cafe = fabrica.criaCafe();
        cafe.setAcucar(fabrica.inseriAcucar());
        cafe.setLeite(fabrica.inseriLeite());
        cafe.setPo(fabrica.inseriSoluvel());
        return cafe;
    }
    
    private Cappuccino criaCappuccino(){
        FabricaCappuccino fabrica = new FabricaCappuccino();
        Cappuccino cpp = fabrica.criaCappuccino();
        cpp.setAcucar(fabrica.inseriAcucar());
        cpp.setBicarbonato(fabrica.inseriBicarbonato());
        cpp.setCanela(fabrica.inseriCanela());
        cpp.setChocolate(fabrica.inseriChocolate());
        cpp.setLeite(fabrica.inseriLeite());
        cpp.setPo(fabrica.inseriSoluvel());        
        return cpp; 
    }
}
