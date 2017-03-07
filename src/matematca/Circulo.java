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
//Para calculo por ingreso de radio
public class Circulo {
    public double radio;
    public double areaRadio;
    public double DiametroRadio;
    public double diametro;
    public static final double pi = 3.1416;
    
    public Circulo(double radio){//asignacion de la variabale
        this.radio = radio;
    }
    
    public double getAreaRadio(){//retorna valor de area
        return areaRadio;
    }
    public void arearadio() {//calcula valor area
        areaRadio = pi * radio * radio;
    }    
    public double getDiametroradio(){//retorna valor diametro
        return DiametroRadio;
    }
    public void diametroradio(){//calcula valor diametro
        DiametroRadio = 2*radio;
    }
    
}

