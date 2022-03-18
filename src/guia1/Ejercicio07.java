/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 *
 * @author ginaozimisa
 */
public class Ejercicio07 {
    public void suma(){
        int numero=100 , suma=0;
        while(numero>=0){
            suma=numero+suma;
            numero=numero-2;     
        }
        System.out.println("Suma: "+suma);
    }
    
}
