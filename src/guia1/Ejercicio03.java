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
public class Ejercicio03 {
    int horas;
    double salario;

   public Ejercicio03 (){
        System.out.println("Ingrese horas de trabajo del obrero: ");
        Scanner sc = new Scanner(System.in);
        this.horas=sc.nextInt();
    }
   
    public double salariosemanal(){
        if(horas<=40){
            salario=20*horas;
        
        }else{
            if(horas>40){
                salario=(20*40)+(horas-40)*25;
            }
            
          
      }
        return salario;
    }
    
    public void mostrarcalculo(){
        System.out.println(salariosemanal());
    }  
}
