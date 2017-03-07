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
            System.out.println("   Bienvenido   ");
            System.out.println("                ");
            System.out.println("Digite la opcion a solucionar");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Triangulo");
            System.out.println("5. Salir");
            des=entrada.nextInt();
            switch(des){
                case 1:
                    menu_cuadrado();//clase cuadrado
                    break;
                case 2:
                    menu_Rectangulo();//clase rectangulo
                    break;
                case 3: 
                    menu_circulo();//clase circulo
                    break;
                case 4:
                    menu_triangulo();//clase triangulo
                    break;
                case 5:
                    des = 0;//para opciones que no estan en el menu
                    break;
                default:
                    System.out.println("No esta dentro de las opciones...");
                 
                 
            }
        }
    }


public void menu_cuadrado(){//menu  para ingresar datos al cuadrado
        int des1=-1;
            System.out.println("Ingrese uno valor del lado:");//solicita dato
            lado = entrada.nextDouble();//lee el dato ingresado
        while(des1!=0){
            //menu interno del cuadrado para hallar area y/o perimetro
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.println("3. salir");
            des1=entrada.nextInt();//lee opcion
        switch(des1){
            case 1:
        
                Cuadrado cuadrado1 = new Cuadrado(lado);//hace el llamado de la clase para retornar los valores
                cuadrado1.area();
                System.out.println("Área del cuadrado es : " + 
                cuadrado1.getareaCuadrado());//retorna el valor del area ya calculado en la clase
                break;
            case 2:
                Cuadrado cuadrado2 = new Cuadrado(lado);//hace el llamado de la clase para retornar los valores
                cuadrado2.perimetro();
                System.out.println("Perimetro del cuadrado  es: " +
                cuadrado2.getperimetroCuadrado());//retorna el valor del area ya calculado en la clase
                break;
            case 3:
                des1=0;
                break;//salida del menu interno del cuadrado
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
public void menu_circulo(){//menu  para ingresar datos al circulo
    int des1=-1;

    
    while(des1 != 0){
        //menu interno del circulo
        System.out.println("Desea Saber las operaciones por:");//solicita dato para calcular por radio o diametro (dato que ingresa)
        System.out.println("1. Radio");
        System.out.println("2. Diametro");
        System.out.println("3. Salir");
        des1=entrada.nextInt();
        switch(des1){
            case 1:
                System.out.println("Ingrese el valor del Radio:");//solicita el valor del radio
                radio = entrada.nextDouble();
                Circulo circulo1 = new Circulo (radio);//hace el llamado de la clase para retornar los valores
                circulo1.arearadio();
                circulo1.diametroradio();
                System.out.println("Área del circulo es : " + 
                circulo1.getAreaRadio());//retorna el valor del area ya calculado en la clase
                System.out.println("Diametro del circulo es : " + 
                circulo1.getDiametroradio());//retorna el valor del perimetro ya calculado en la clase
                break;
            case 2:
                System.out.println("Ingrese el valor del Diametro:");//solicita el valor del diametro
                diametro = entrada.nextDouble();
                Circulo_2 circulo2 = new Circulo_2(diametro);//hace el llamado a la clase circulo 2 para retornar valores
                circulo2.areadiametro();
                circulo2.radiodiametro();
                System.out.println("Área del circulo es : " +
                circulo2.getAreaDiametro());//retorna el valor del area ya calculado en la clase
                System.out.println("Radio del circulo es : " + 
                circulo2.getDiametroRadio());//retorna el valor del radio ya calculado en la clase
                break;
            case 3:
                des1 = 0;//salida del menu interno del circulo
                break;
            default:
                System.out.println("No esta dentro de las 3 opciones.");
}
}
}
public void menu_triangulo(){//menu para el triangulo

    
     int des1=-1;//solicita los seis puntos del triangulo por variable independiente
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
            //menu para clacular area o perimetro con los datos ingresados
            System.out.println("1. Area");
            System.out.println("2. Perimetro");//la medida de los tres lados va calculada en el perimetro
            System.out.println("3. salir");
            des1=entrada.nextInt();
        switch(des1){
            case 1:
        
                Triangulo triangulo1 = new Triangulo(x1,x2,x3,y1,y2,y3);//llama la clase y asigna valores ingresados
                triangulo1.area();
                System.out.println("El area del Triangualo es: "+
                triangulo1.getareaTriangulo());//retorna el valor del area ya calculado para imprimir
                break;
            case 2:
                Triangulo triangulo2 = new Triangulo(x1,x2,x3,y1,y2,y3);//llama la clase y asigna valores ingresados
                triangulo2.perimetrotriangulo();
                System.out.println("El perimetro del Triangulo es:"+
                triangulo2.getPerimetroTriangulo());//retorna el perimetro ya claculado
                System.out.println("El lado A Del triangulo es:"+
                triangulo2.getladoa());//retorna la medida del lado a-b
                System.out.println("El lado B Del triangulo es:"+
                triangulo2.getladob());//retorna la medida del lado b-c
                System.out.println("El lado C Del triangulo es:"+
                triangulo2.getladoc());//retorna la medida del lado a-c
                break;
            case 3: 
                des1 = 0;//salida del menu interno del triangulo
                break;
            default:
                System.out.println("No esta dentro de las opciones...");
        }
}
}
}

    



