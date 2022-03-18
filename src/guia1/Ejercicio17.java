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
public class Ejercicio17 {

    int l;
    int n;

    public Ejercicio17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese l");
        this.l = sc.nextInt();
        String salto = sc.nextLine();
        System.out.println("Ingrese n");
        this.n = sc.nextInt();
        salto = sc.nextLine();
    }

    public void tablas() {
        int mult, i, j;
        for (i = 1; i <= l; i++) {
            System.out.println("tabla " + i);
            for (j = 1; j <= n; j++) {
                mult = i * j;
                System.out.println(i + "*" + j + "=" + mult);
            }
        }
        System.out.println("\t");
    }

}
