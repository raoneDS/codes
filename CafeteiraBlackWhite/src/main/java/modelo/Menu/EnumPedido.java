/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Menu;

/**
 *
 * @author Raone
 */
public enum EnumPedido {
    CafeNormal(1), Descafeinado(2), CappuccinoEnum(3);
    public int idBebida;
    EnumPedido(int valor){
        idBebida = valor;
    }
}
