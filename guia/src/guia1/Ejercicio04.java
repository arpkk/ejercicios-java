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
public class Ejercicio04 {
    int cantAsig;
    String asig[];
    int notas[];
    
    public Ejercicio04(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de asignaturas ");
        this.cantAsig= sc.nextInt();
        String salto=sc.nextLine();
        asig = new String[cantAsig];
        notas = new int[cantAsig];
        for(int i=0;i<cantAsig;i++){
            int j=i+1;
            System.out.println("Ingrese el nombre de la asignatura "+j);
            asig[i]= sc.nextLine();
            System.out.println("Ingrese la nota de la asignatura "+j);
            notas[i]=sc.nextInt();
            salto=sc.nextLine();
        }
    }
    
    
    public void menornota(){
        int menor=this.notas[0], ban=0;
        for (int i=0;i<cantAsig;i++){
            if(menor>this.notas[i]){
                menor=this.notas[i];
                ban=i;
            }
        }
        System.out.println("La nota más baja es "+asig[ban]+" con nota "+menor);
    }
    
    public float promedio(){
        int suma=0;
        for(int i=0;i<cantAsig;i++)
            suma=suma+notas[i];
        return suma/cantAsig;
    }
}
