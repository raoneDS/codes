/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Menu;

import java.util.ArrayList;
import modelo.Bebida;
import modelo.Ingredientes.*;

/**
 *
 * @author Suporte
 */
public class Cappuccino extends Bebida {
    
    public Cappuccino(){
        this.nome = "Capuccino";
        this.preco = 5.00;
    }
    
    public void setAcucar(ArrayList<Acucar> acucar) {
        this.ingredientes.add(acucar);
    }
    public void setLeite(ArrayList<Leite> leite) {
        this.ingredientes.add(leite);
    }
    public void setPo(ArrayList<Soluvel> po) {
        this.ingredientes.add(po);
    }
    public void setBicarbonato(ArrayList<Bicarbonato> bicarbonato) {
        this.ingredientes.add(bicarbonato);
    }
    public void setChocolate(ArrayList<Chocolate> chocolate) {
        this.ingredientes.add(chocolate);
    }
    public void setCanela(ArrayList<Canela> canela) {
        this.ingredientes.add(canela);
    } 
}
