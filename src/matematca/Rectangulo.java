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
public class Rectangulo {
    public double base;
    public double altura;
    public double areaRectangulo;
    public double PerimetroRectangulo;
    public double perimetro;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getAreaRectangulo(){
        return areaRectangulo;
    }
    public void area(){
        areaRectangulo = base * altura;
    }
    public double getPerimetroRectangulo(){
        return PerimetroRectangulo;
    }
    public void perimetro(){
        PerimetroRectangulo = (base*2)+(altura*2);
    }
}
