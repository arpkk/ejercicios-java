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
public class Ejercicio13 {

    int a;
    int b;

    public Ejercicio13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        this.a = sc.nextInt();
        System.out.println("Ingrese otro número");
        this.b = sc.nextInt();
    }

    public void multiplicar() {
        int resultado = 0;
        for (int i = 0; i < a; i++) {
            resultado = resultado + b;
        }
        System.out.println("El resultado de la multiplicacion " + a + "*" + b + " es: " + resultado);
    }
}
