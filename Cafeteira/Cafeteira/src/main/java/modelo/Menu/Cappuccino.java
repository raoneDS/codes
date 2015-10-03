/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Menu;

import modelo.Bebidas;
import modelo.Ingredientes.Canela;
import modelo.Ingredientes.Bicarbonato;
import modelo.Ingredientes.Soluvel;
import modelo.Ingredientes.LeitePo;
import modelo.Ingredientes.Chocolate;
import modelo.Ingredientes.Acucar;

/**
 *
 * @author Suporte
 */
public class Cappuccino extends Bebidas {
    private int qtdSoluvel = 100;
    private int qtdAcucar = 200;
    private int qtdLeite = 100;
    private int qtdBicarbonato = 1;
    private int qtdChocolate = 50;
    private int qtdCanela = 1;
    
    public Cappuccino(){
        super(5.00);
        
        int k;
        
        //100g cafe soluvel
        for(k=0; k< this.qtdSoluvel; k++){
            Soluvel cafe = new Soluvel();
            this.ingredientes.add(cafe);
        }
        
        //200g Acucar
        for(k=0; k<this.qtdAcucar; k++){
            Acucar acucar = new Acucar();
            this.ingredientes.add(acucar);
        }
        
        //100g Leite em Po
        for(k=0; k<this.qtdAcucar; k++){
            LeitePo leite = new LeitePo();
            this.ingredientes.add(leite);
        }
        
        //1 colher bicarbonato
        for(k=0; k<this.qtdBicarbonato; k++){
            Bicarbonato bicarbonato = new Bicarbonato();
            this.ingredientes.add(bicarbonato);
        }
        
        //50g chocolate
        for(k=0; k<this.qtdChocolate; k++){
            Chocolate chocolate = new Chocolate();
            this.ingredientes.add(chocolate);
        }
        
        //1 colher de canela
        for(k=0; k<this.qtdCanela; k++){
            Canela canela = new Canela();
            this.ingredientes.add(canela);
        }
    }
    
}
