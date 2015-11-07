/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Suporte
 */
abstract public class Ingrediente {
    
    protected String nome;
    protected String unidadeMedida;
    public Ingrediente(String nome,String unidadeMedida){
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
    }  
}
