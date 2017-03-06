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
    public double radio;
    public double areaRadio;
    public double DiametroRadio;
    public double diametro;
    public static final double pi = 3.1416;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double getAreaRadio(){
        return areaRadio;
    }
    public void arearadio() {
        areaRadio = pi * radio * radio;
    }    
    public double getDiametroradio(){
        return DiametroRadio;
    }
    public void diametroradio(){
        DiametroRadio = 2*radio;
    }
    
}

