/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.util.ArrayList;
import modelo.Cafe;
import modelo.Ingredientes.Acucar;
import modelo.Ingredientes.Leite;

/**
 *
 * @author Raone
 */
abstract public class FabricaCafe {
    protected int k;
    protected int qtdAcucar = 200;
    protected int qtdLeite = 100;
    protected int qtdPo = 50;
    
    abstract public Cafe criaCafe();
    abstract public ArrayList inseriSoluvel();
    
    public ArrayList inseriAcucar(){
       ArrayList<Acucar> vetor = new ArrayList<>();
       for(k=0;k<this.qtdAcucar;k++){
           Acucar acucar = new Acucar();
           vetor.add(acucar);
       }
       return vetor;
    }
    public ArrayList inseriLeite() {
       ArrayList<Leite> vetor = new ArrayList<>();
       for(k=0;k<this.qtdLeite;k++){
           Leite leite = new Leite();
           vetor.add(leite);
       }
       return vetor;
    }
}
