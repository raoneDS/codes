/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Ingredientes.Leite;
import modelo.Ingredientes.Acucar;

/**
 *
 * @author Suporte
 */
abstract public class Cafe extends Bebidas{
    
    protected int qtdAcucar = 200;
    protected int qtdLeite = 100;
    protected int qtdPo = 50;
    public Cafe(Double preco){
        super(preco);
        
        int k;
        
        // 100 ml de leite
        for(k=0; k< this.qtdLeite; k++){
            Leite leite = new Leite();
            this.ingredientes.add(leite);
        }
        
        // 200g de acucar
        for(k=0; k< this.qtdAcucar; k++){
            Acucar acucar = new Acucar();
            this.ingredientes.add(acucar);
        }
    }
}
