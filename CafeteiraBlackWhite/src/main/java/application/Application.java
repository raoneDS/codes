/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import design.FabricaBebida;
import modelo.*;

/**
 *
 * @author Suporte
 */
public class Application {
    public static void main(String [] args){
        FabricaBebida cafeteira = new FabricaBebida();
        Bebida xicara = cafeteira.fazerPedido("CafeNormal","Chantili");
        System.out.println(xicara);
    }
}
