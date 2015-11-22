/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.util.ArrayList;
import modelo.Menu.Cappuccino;
import modelo.Ingredientes.*;

/**
 *
 * @author Suporte
 */
public class FabricaCappuccino {
    
    private final int qtdSoluvel = 100;
    private final int qtdAcucar = 200;
    private final int qtdLeite = 100;
    private final int qtdBicarbonato = 1;
    private final int qtdChocolate = 50;
    private final int qtdCanela = 1;
    private int k;
    
    public ArrayList inseriAcucar(){
        ArrayList<Acucar> vetor = new ArrayList<>();
        for(k=0;k<this.qtdAcucar;k++){
            Acucar acucar = new Acucar();
            vetor.add(acucar);
        }
        return vetor;
    }
    public ArrayList inseriLeite(){
        ArrayList<LeitePo> vetor = new ArrayList<>();
        for(k=0;k<this.qtdLeite;k++){
            LeitePo leite = new LeitePo();
            vetor.add(leite);
        }
        return vetor;
    }
    public ArrayList inseriSoluvel(){
        ArrayList<Soluvel> vetor = new ArrayList<>();
        for(k=0; k< this.qtdSoluvel; k++){
            SoluvelComum cafe = new SoluvelComum();
            vetor.add(cafe);
        }
        return vetor;
    }
    public ArrayList inseriBicarbonato(){
        ArrayList<Bicarbonato> vetor = new ArrayList<>();
        for(k=0; k<this.qtdBicarbonato; k++){
            Bicarbonato bicarbonato = new Bicarbonato();
            vetor.add(bicarbonato);
        }
        return vetor;
    }
    public ArrayList inseriChocolate(){
        ArrayList<Chocolate> vetor = new ArrayList<>();
        for(k=0; k<this.qtdChocolate; k++){
            Chocolate chocolate = new Chocolate();
            vetor.add(chocolate);
        }
        return vetor;
    }
    public ArrayList inseriCanela(){
        ArrayList<Canela> vetor = new ArrayList<>();
        for(k=0; k<this.qtdCanela; k++){
            Canela canela = new Canela();
            vetor.add(canela);
        }
        return vetor;
    }
    public Cappuccino criaCappuccino(){
        Cappuccino bebida = new Cappuccino();
        return bebida;
    }
    
}
