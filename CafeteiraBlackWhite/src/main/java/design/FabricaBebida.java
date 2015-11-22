/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;
import modelo.*;
import modelo.Complementos.*;
import modelo.Menu.*;

/**
 *
 * @author Suporte
 */
public class FabricaBebida {
    
    public Bebida fazerPedido(String pedido,String adicional){
        Bebida bebida = null;
        if(pedido.equals("Cappuccino")){
            bebida = criaCappuccino();
        }else
            bebida = criaCafe(pedido);
        if(adicional != null)
            bebida = inseriAdicional(bebida, adicional);
        return bebida;
    }
    
    private Cafe criaCafe(String pedido){
        FabricaCafe fabrica = null;
        if(pedido.equals("CafeNormal")){
            fabrica = new FabricaCafeNormal();
        }else{
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
    
    private ComplementoDecorator inseriAdicional(Bebida bebida, String adicional){
        ComplementoDecorator decorator = null;
        switch (adicional) {
            case "Chantili":
                decorator = new Chantili(bebida);
                break;
            case "Chocolate":
                decorator = new ChocolateCmp(bebida);
                break;
            case "CremeLaranja":
                decorator = new CremeLaranja(bebida);
                break;
            case "Licor":
                decorator = new Licor(bebida);
                break;
        }
        return decorator;
    }
}
