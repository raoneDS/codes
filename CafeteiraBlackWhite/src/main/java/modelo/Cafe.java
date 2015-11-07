/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import modelo.Ingredientes.*;

/**
 *
 * @author Suporte
 */
abstract public class Cafe extends Bebida{
    public Cafe(Double preco, String nome){
        super(preco,nome);
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    public void setAcucar(ArrayList<Acucar> acucar) {
        this.ingredientes.add(acucar);
    }
    
    public void setPo(ArrayList<Soluvel> po) {
        this.ingredientes.add(po);
    }
        
    public void setLeite(ArrayList<Leite> leite) {
        this.ingredientes.add(leite);
    }
}
