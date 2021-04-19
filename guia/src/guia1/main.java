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
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //ej 1
        /*System.out.println("Ejercicio 1");
        Ejercicio1 obj=new Ejercicio1();
        obj.imprimir();
        int c7=obj.contar7();
        int s7=obj.suma7();
        int c3=obj.contar3();
        System.out.println("\nMultiplos de 7="+c7);
        System.out.println("Suma de 7="+s7);
        System.out.println("Multiplos de 3="+c3);
        
        //ej 2
        System.out.println("Ejercicio 2");
        Ejercicio2 eje2 = new Ejercicio2(); 
        eje2.printrango();
        eje2.contpar();
        eje2.sumarimpar();
        
        //ej 3
        System.out.println("Ejercicio 3");
        System.out.println("Ingrese el numero de obreros ");
        int n= sc.nextInt();
        String salto=sc.nextLine();
        Ejercicio3 eje3[]= new Ejercicio3[n];
        if(n<6)
            System.out.println("Debe ingresar más de 5");
        else{
            for(int i=0;i<n;i++)
                eje3[i] = new Ejercicio3();
        for(int i=0; i<n;i++){
            int j=i+1;
            System.out.print("Obrero "+j+": ");
            eje3[i].mostrarcalculo();
            }
        }
        
        */
        //ej 4
        System.out.println("Ejercicio 4");
        System.out.println("Ingrese el numero de alumnos ");
        int n= sc.nextInt();
        String salto=sc.nextLine();
        Ejercicio04 eje4[]= new Ejercicio04[n];
        for(int i=0;i<n;i++)
            eje4[i]= new Ejercicio04();
        for(int i=0;i<n;i++){
            int j=i+1;
            System.out.println("Alumno: "+j);
            eje4[i].menornota();
        }
        
        float menor=eje4[0].promedio();
        int ban=0;
        for (int i=0;i<n;i++){
            if(menor>eje4[i].promedio()){
                menor=eje4[i].promedio();
                ban=i+1;
            }
        }
        System.out.println("El menor promedio es "+menor+" del alumno "+ban);
        
        int cont=0;
        for(int i=0;i<n;i++){
            if(eje4[i].cantAsig>4)
                cont++;
        }
        int porcentaje=cont*100/n;
        System.out.println("Un "+porcentaje+"% tiene más de 4 asignaturas");
        
        
        /*
        //ej 5
        System.out.println("Ejercicio 5");
        Ejercicio5 eje5 = new Ejercicio5();
        eje5.mostrar();
        
        //ej 6
        System.out.println("Ejercicio 6");
        
        //ej 7
        System.out.println("Ejercicio 7");
        Ejercicio7 eje7 = new Ejercicio7();
        eje7.suma();
        
        //ej 31
        System.out.println("Ejercicio 31");
        System.out.println("Ingrese un numero mayor o igual a 15");
        int n= sc.nextInt();
        if(n>=15){
            Ejercicio31 eje31 = new Ejercicio31(n);
            System.out.println("Hay "+eje31.Primo()+" primos entre 0 y "+n);
        }
        else
            System.out.println("No es mayor o igual a 15");
        
        */
        
    }
}