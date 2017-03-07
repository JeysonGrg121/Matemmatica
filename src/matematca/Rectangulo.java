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
//varibles  
    public double base;
    public double altura;
    public double areaRectangulo;
    public double PerimetroRectangulo;
    public double perimetro;

    public Rectangulo(double base, double altura){//la asignacion de los datos a la clase
        this.base = base;
        this.altura = altura;
    }

    public double getAreaRectangulo(){//retorna los valores
        return areaRectangulo;
    }
    public void area(){//en este metodo hace el calculo deseado y guardo en variable que va retornar
        areaRectangulo = base * altura;
    }
    public double getPerimetroRectangulo(){//retorna los valores
        return PerimetroRectangulo;
    }
    public void perimetro(){//en este metodo hace el calculo deseado y guardo en variable que va retornar
        PerimetroRectangulo = (base*2)+(altura*2);
    }
}
