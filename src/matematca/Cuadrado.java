/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematca;

/**
 *
 * @author Carlos
 */
public class Cuadrado {
    private double lado;
    private double areaCuadrado;

    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getareaCuadrado(){
        return areaCuadrado;
    }    
  
    public void area(){
        areaCuadrado = lado * lado;
    }    
    
}
