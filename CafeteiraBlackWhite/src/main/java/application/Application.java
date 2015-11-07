/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import design.FabricaBebida;
import modelo.*;
import modelo.Complementos.Chantili;
import modelo.Complementos.Licor;

/**
 *
 * @author Suporte
 */
public class Application {
    public static void main(String [] xxx){
        FabricaBebida cafeteira = new FabricaBebida();
        Bebida xicara = null; //Fabrica abstrata
        xicara = cafeteira.fazerPedido(3);
        ComplementoDecorator adicional = null;
        adicional = new Chantili(xicara);
        adicional = new Licor(xicara);
        //System.out.println(adicional);
        System.out.println(xicara);
    }
}
