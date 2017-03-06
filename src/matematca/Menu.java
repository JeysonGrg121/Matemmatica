/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematca;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Menu {
   
  Scanner entrada = new Scanner(System.in);
  double lado;
  double base;
  double altura;
  double radio;
  double diametro;
    
    
    public void me(){
        
       
        
        
        int des =-1;
        
        
        while(des!=0){
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Salir");
            des=entrada.nextInt();
            switch(des){
                case 1:
                    menu_cuadrado();
                    break;
                case 2:
                    menu_Rectangulo();
                    break;
                case 3: 
                    menu_circulo();
            }
        }
    }


    public void menu_cuadrado(){
        int des1=-1;
            System.out.println("Ingrese uno valor del lado:");
            lado = entrada.nextDouble();
        while(des1!=0){
            
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. salir");
            des1=entrada.nextInt();
        switch(des1){
            case 1:
        
                Cuadrado cuadrado1 = new Cuadrado(lado);
                cuadrado1.area();
                System.out.println("Área del cuadrado es : " + 
                cuadrado1.getareaCuadrado());
                break;
            case 2:
                Cuadrado cuadrado2 = new Cuadrado(lado);
                cuadrado2.perimetro();
                System.out.println("Perimetro del cuadrado  es: " +
                cuadrado2.getperimetroCuadrado());
                break;
            case 3:
                des1=0;
                break;
            default:
                System.out.println("No esta dentro de las 3 opciones.");
}

}

    }
public void menu_Rectangulo(){
    int des1=-1;
            System.out.println("Ingrese el valor del Base:");
            base = entrada.nextDouble();
            System.out.println("ingrese el valor del Altura ");
            altura = entrada.nextDouble();
        while(des1!=0){
            
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. salir");
            des1=entrada.nextInt();
        switch(des1){
            case 1:
        
                Rectangulo rectangulo1 = new Rectangulo(base,altura);
                rectangulo1.area();
                System.out.println("Área del rectángulo : " + 
                rectangulo1.getAreaRectangulo());
                break;
            case 2:
                 Rectangulo rectangulo2 = new Rectangulo(base,altura);
                rectangulo2.perimetro();
                System.out.println("Perimetro del rectángulo : " + 
                rectangulo2.getPerimetroRectangulo());
                break;
            case 3:
                des1=0;
                break;
            default:
                System.out.println("No esta dentro de las 3 opciones.");
}

}
}
public void menu_circulo(){
    int des1=-1;

    
    while(des1 != 0){
        System.out.println("Desea Saber las operaciones por:");
        System.out.println("1. Radio");
        System.out.println("2. Diametro");
        System.out.println("3. Salir");
        des1=entrada.nextInt();
        switch(des1){
            case 1:
                System.out.println("Ingrese el valor del Radio:");
                radio = entrada.nextDouble();
                Circulo circulo1 = new Circulo (radio);
                circulo1.arearadio();
                circulo1.diametroradio();
                System.out.println("Área del circulo es : " + 
                circulo1.getAreaRadio());
                System.out.println("Diametro del circulo es : " + 
                circulo1.getDiametroradio());
                break;
            case 2:
                System.out.println("Ingrese el valor del Diametro:");
                diametro = entrada.nextDouble();
                Circulo_2 circulo2 = new Circulo_2(diametro);
                circulo2.areadiametro();
                circulo2.radiodiametro();
                System.out.println("Área del circulo es : " +
                circulo2.getAreaDiametro());
                System.out.println("Radio del circulo es : " + 
                circulo2.getDiametroRadio());
                break;
            case 3:
                des1 = 0;
                break;
            default:
                System.out.println("No esta dentro de las 3 opciones.");
}
}
}
}
    



