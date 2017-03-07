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
  double x1;
  double x2;
  double x3;
  double y1,y2,y3;

    
    
    public void me(){
        
       
        
        
        int des =-1;
        
        
        while(des!=0){
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Triangulo");
            System.out.println("5. Salir");
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
                    break;
                case 4:
                    menu_triangulo();
                    break;
                case 5:
                    des = 0;
                    break;
                default:
                    System.out.println("No esta dentro de las opciones...");
                 
                 
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
            base = entrada.nextDouble();//lee el valor 
            System.out.println("ingrese el valor del Altura ");
            altura = entrada.nextDouble();//lee el valor
        //while para que el usuario pueda ingresar las veces que desee
            while(des1!=0){
            //
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. salir");
            des1=entrada.nextInt();//valor en se guarde 
        //un switch para cada operacion que desee utiliza o salir 
            switch(des1){
            case 1:
        
                Rectangulo rectangulo1 = new Rectangulo(base,altura);//llamado de la clase para el retorno de los valores
                rectangulo1.area();
                System.out.println("Área del rectángulo : " + //retorna el valor calculado
                rectangulo1.getAreaRectangulo());
                break;
            case 2:
                 Rectangulo rectangulo2 = new Rectangulo(base,altura);//llamado de la clase para retorno de valores
                rectangulo2.perimetro();
                System.out.println("Perimetro del rectángulo : " + //retorna el valor calculado
                rectangulo2.getPerimetroRectangulo());
                break;
            case 3:// en caso de que desee salir de est menu 
                des1=0;
                break;
            default:
                System.out.println("No esta dentro de las 3 opciones.");//en caso de nu ingresar un valor valido mostrara por pantalla el error
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
public void menu_triangulo(){

    
     int des1=-1;
            System.out.println("ingrese el valor de x1: ");
            x1= entrada.nextDouble();
            System.out.println("ingrese el valor de y1: ");
            y1= entrada.nextDouble();
            System.out.println("ingrese el valor de x2: ");
            x2= entrada.nextDouble();
            System.out.println("ingrese el valor de y2: ");
            y2= entrada.nextDouble();
            System.out.println("ingrese el valor de x3: ");
            x3= entrada.nextDouble();
            System.out.println("ingrese el valor de y3: ");
            y3= entrada.nextDouble();
        while(des1!=0){
            
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. salir");
            des1=entrada.nextInt();
        switch(des1){
            case 1:
        
                Triangulo triangulo1 = new Triangulo(x1,x2,x3,y1,y2,y3);
                triangulo1.area();
                System.out.println("El area del Triangualo es: "+
                triangulo1.getareaTriangulo());
                break;
            case 2:
                Triangulo triangulo2 = new Triangulo(x1,x2,x3,y1,y2,y3);
                triangulo2.perimetrotriangulo();
                System.out.println("El perimetro del Triangulo es:"+
                triangulo2.getPerimetroTriangulo());
                System.out.println("El lado A Del triangulo es:"+
                triangulo2.getladoa());
                System.out.println("El lado B Del triangulo es:"+
                triangulo2.getladob());
                System.out.println("El lado C Del triangulo es:"+
                triangulo2.getladoc());
                break;
            case 3: 
                des1 = 0;
                break;
            default:
                System.out.println("No esta dentro de las opciones...");
        }
}
}
}

    



