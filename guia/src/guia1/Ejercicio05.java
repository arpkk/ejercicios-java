/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author ginaozimisa
 */
public class Ejercicio05 {
    float lado1;
    float lado2;
    float lado3;
    
    public Ejercicio05(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension del lado 1: ");
        this.lado1= sc.nextFloat();
        String salto=sc.nextLine();
        System.out.println("Ingrese la dimension del lado 2: ");
        this.lado2= sc.nextFloat();
        String salto1=sc.nextLine();
        System.out.println("Ingrese la dimension del lado 3: ");
        this.lado3= sc.nextFloat();
    }
 
    public float perimetro(){
        float perimetro;
        perimetro=(lado1+lado2+lado3);
        return perimetro;
    }
    
    public float area(){
        float area, semiper=(lado1+lado2+lado3)/2;
        area= (float) Math.sqrt(semiper*(semiper-lado1)*(semiper-lado2)*(semiper-lado3));
        return area;  
    }
    public String tipoTriangulo(){
        if(lado1==lado2 && lado2==lado3)
            return "Triangulo Equilatero";
        if((lado1==lado2 && lado2!=lado3) || (lado2==lado3 && lado3!=lado1) || (lado3==lado1 && lado1!=lado2))
            return "Triangulo Isoceles";  
        else
            return "Triangulo Escaleno";       
    }
    
    public boolean formarTriangulo(){
        if(lado1+lado2>lado3)
            return true;
        else
            return false;
  } 
    public void mostrar(){
        boolean puede=formarTriangulo();
        if(puede==true)
            System.out.println("Tipo :"+tipoTriangulo()+"\nPerimetro: "+perimetro()+"\nArea: "+area());       
        else
            System.out.println("No se puede formar triangulo");    
    } 
}
