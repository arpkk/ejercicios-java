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
public class Ejercicio02 {
    int numero1;
    int numero2;
    
    public Ejercicio02(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        this.numero1 = sc.nextInt();
        System.out.println("Ingrese otro numero");  
        this.numero2 = sc.nextInt();
   }
    public void printrango(){
        int cant=0;
        for(int i=numero1+1;i<numero2;i++){
            System.out.println(i);
            cant=cant+1;
        }
        System.out.println("La cantidad de números que hay entre "+numero1+" y "+numero2+" es:"+cant);
    } 
    
    public void contpar(){
        int cant=0;
        for(int i=numero1+1;i<numero2;i++){
            if(i%2==0){
               cant=cant+1;   
            }
        }
        System.out.println("La cantidad de pares entre "+numero1+" y "+numero2+" es:"+cant);
    }
    
    public void sumarimpar(){
        int sum=0;
        for(int i=numero1+1;i<numero2;i++){
            if(i%2!=0){
                sum=sum+i;
                
            }
        }
        System.out.println("La suma de impares que estan entre "+numero1+" y "+numero2+" es:"+sum);
    }
}
