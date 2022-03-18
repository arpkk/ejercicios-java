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
public class Ejercicio06 extends Ejercicio03 {

    int n;
    int salarioini;

    public Ejercicio06() {
        System.out.println("Ingrese el salario");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        this.salario = sc.nextInt();
    }

    public float salario() {
        int horasExtra = horas - 40;
        if (horas <= 40) {
            salario = salarioini * 40;
        }

        if (horas > 40 && horasExtra <= 8) {
            salario = salarioini * 40 + (salarioini * 2) * horasExtra;
        }

        if (salarioini > 40 && horasExtra > 8) {
            salario = salarioini * 40 + (salarioini * 2 * 8) + ((horasExtra - 8) * (salarioini * 3));
        }

        return (float) salario;
    }
}
