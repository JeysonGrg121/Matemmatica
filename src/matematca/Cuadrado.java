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
    public double lado;
    public double areaCuadrado;
    public double perimetroCuadrado;
    
     public Cuadrado(double lado){
        this.lado = lado;
    }
     public void area(){
         areaCuadrado = lado*lado;
         
     }
      public double getareaCuadrado(){
        return areaCuadrado;
        }    
    public double getperimetroCuadrado(){
        return perimetroCuadrado; 
        
    }
    public void  perimetro(){
        perimetroCuadrado = 4*lado;
     }
    
}