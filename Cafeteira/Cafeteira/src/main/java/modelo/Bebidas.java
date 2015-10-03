/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import modelo.Ingredientes.Agua;
import java.util.ArrayList;

/**
 *
 * @author Suporte
 */
public class Bebidas{
    
    protected ArrayList<Ingrediente> ingredientes;
    protected double preco;
    protected int qtdAgua = 100;
    
    public Bebidas(Double preco){
        this.ingredientes = new ArrayList<>();
        this.preco = preco;
        
        // ADICIONA 100ml de Agua em todas as bebidas
        for(int k=0; k<this.qtdAgua; k++){
            Agua agua = new Agua();
            this.ingredientes.add(agua);
        }
    }
}