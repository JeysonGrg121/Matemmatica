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
public class Circulo {
    private double radio;
    private double areaRadio;
    private static final double pi = 3.1416;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getAreaRadio(){
        return areaRadio;
    }
    public void area() {
        areaRadio = pi * radio * radio;
    }    
}
