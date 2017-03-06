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
class Circulo_2 {
    public double diametro;
    public double areaDiametro;
    public double Diametroradio;
    public double aux = 0.5;
    public static final double pi = 3.1416;
    public Circulo_2(double diametro){
        this.diametro = diametro;
    }
    public double getAreaDiametro(){
        return areaDiametro;
    }
    public void areadiametro(){
        areaDiametro = pi *((diametro*diametro)/4);
    }
    public double getDiametroRadio(){
        return Diametroradio;
    }
    public void radiodiametro(){
        Diametroradio = aux*diametro;
    }
}
