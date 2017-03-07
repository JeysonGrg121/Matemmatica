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
//Para calculo por ingreso de diametro
class Circulo_2 {
    public double diametro;
    public double areaDiametro;
    public double Diametroradio;
    public double aux = 0.5;
    public static final double pi = 3.1416;
    public Circulo_2(double diametro){//asigna el valor a la variable
        this.diametro = diametro;
    }
    public double getAreaDiametro(){//retorna valor area
        return areaDiametro;
    }
    public void areadiametro(){//calcula valor area
        areaDiametro = pi *((diametro*diametro)/4);
    }
    public double getDiametroRadio(){//retorna valor radio
        return Diametroradio;
    }
    public void radiodiametro(){//calcula valo radio
        Diametroradio = aux*diametro;
    }
}
