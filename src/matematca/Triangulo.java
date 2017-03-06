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
public class Triangulo {
    public double x1;
    public double x2;
    public double x3;
    public double y1,y2,y3;
    public double aux = 0.5;
    public double areaTriangulo;
    public double ladoa ,ladob,ladoc;
    public double perimetroTriangulo;
    
    

 public Triangulo(double x1,double x2,double x3,double y1,double y2,double y3){
       
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
    }

    public double getareaTriangulo(){
        return areaTriangulo;
    }

        
    public void area(){
        areaTriangulo = (((x1*y2)+(x2*y3)+(x3*y1))-((x1*y3)+(x3*y2)+(x2*y1)))*aux;
    }  
    public double getPerimetroTriangulo(){        
        return perimetroTriangulo;
    }
    public double getladoa(){
        return ladoa;
    }
    public double getladob(){
        return ladob;
    }
    public double getladoc(){
        return ladoc;
    }
    public void perimetrotriangulo(){
        double a,b,c,d,e,f;
        double q,w,r,t,y,z; 
        
        a = x2-x1;
        b = y2-y1;
        c = x3-x2;
        d = y3-y2;
        e = x3-x1;
        f = y3-x1;
        q = Math.pow(a,2);
        w = Math.pow(b,2);
        r = Math.pow(c,2);
        t = Math.pow(d,2);
        y = Math.pow(e,2);
        z = Math.pow(f,2);
        ladoa = Math.sqrt(q+w);
        ladob = Math.sqrt(r+t);
        ladoc = Math.sqrt(y+z);
        perimetroTriangulo = ladoa + ladob + ladoc;
    }

    
    
}
