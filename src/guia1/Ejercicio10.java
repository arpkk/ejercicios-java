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
public class Ejercicio10 {

    int dia;
    int mes;
    int año;
    int diactual;
    int mesactual;
    int añoactual;

    public Ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dia de nacimiento");
        this.dia = sc.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        this.mes = sc.nextInt();
        System.out.println("Ingrese año de nacimiento");
        this.año = sc.nextInt();
        System.out.println("Ingrese dia de actual");
        this.diactual = sc.nextInt();
        System.out.println("Ingrese mes de actual");
        this.mesactual = sc.nextInt();
        System.out.println("Ingrese año de actual");
        this.añoactual = sc.nextInt();
    }

    public void edad() {
        int edad = añoactual - año;
        if (mes > mesactual) {
            edad = edad - 1;
        }
        if (mes == mesactual) {
            if (dia > diactual) {
                edad = edad - 1;
            }
        }
        System.out.println("Tiene " + edad + " años");
    }
}
