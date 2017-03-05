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
public class Matematca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //probar clases cálculo areas        
        Cuadrado cuadrado = new Cuadrado(2);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 2: " + 
                cuadrado.getareaCuadrado());
        
        Circulo circulo = new Circulo(90);
        circulo.area();
        System.out.println("Área del círculo de radio 90: " + 
                circulo.getAreaRadio());
        
        Rectangulo rectangulo = new Rectangulo(70, 2);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 70 y altura 2: " + 
                rectangulo.getAreaRectangulo());

        Triangulo triangulo = new Triangulo(6, 6);
        triangulo.area();
        System.out.println("Área del triángulo de base 6 y altura 6: " + 
                triangulo.getareaTriangulo());   
    }
    
}
