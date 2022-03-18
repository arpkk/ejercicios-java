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
public class Ejercicio01 {
    public void imprimir(){
        for(int i=347;i<=2342;i++){
            System.out.print(i+"\t");
        }    
    }
    public int contar7(){
        int cant=0;
        for(int i=347; i<=2342;i++){
            if(i%7==0)
                cant++;
        }
        return cant;
    }
    public int contar3(){
        int cant=0;
        for(int i=347; i<=2342;i++){
            if(i%3==0)
                cant++;
        }
        return cant;
    }
    public int suma7(){
        int suma=0;
        for(int i=347; i<=2342;i++){
            if(i%7==0)
                suma=suma+(int)(Math.pow(i,2));
        }
        return suma;
    }
}
