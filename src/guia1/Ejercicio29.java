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
public class Ejercicio29 {

    int valor;
    int cant;

    public Ejercicio29() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto ");
        this.valor = sc.nextInt();
        String salto = sc.nextLine();
        System.out.println("Ingrese la cantidad comprada del producto ");
        this.cant = sc.nextInt();
        salto = sc.nextLine();
    }

    public float iva() {
        float iva;
        iva = (float) cant * 21 / 100;
        return iva;
    }

    public int total() {
        int precio = (int) (iva() + valor);
        return precio;
    }

    public void pago() {
        int pago, vuelto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad con que paga ");
        pago = sc.nextInt();
        String salto = sc.nextLine();
        if (pago < total()) {
            System.out.println("No alcanza");
        } else {
            vuelto = pago - total();
            System.out.println("El vuelto es " + vuelto);
        }

    }

}
