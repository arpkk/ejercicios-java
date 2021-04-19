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
public class Ejercicio18 {

    public int numeroIngresado;

    public Ejercicio18(int n) {
        this.numeroIngresado = n;
    }

    public int fib(int numeroIngresado) {
        if (numeroIngresado <= 1) {
            return numeroIngresado;
        }
        return fib(numeroIngresado - 1) + fib(numeroIngresado - 2);
    }

    public void suceba() {
        int numfib = 0;
        while (numfib <= numeroIngresado) {
            System.out.print(fib(numfib)+" ");
            numfib++;
        }
        System.out.println(" ");
    }

    public void sucecb() {
        int auxiliar = 0;
        for (int i = 1; i <= numeroIngresado; i++) {
            auxiliar = auxiliar * 10 + i;
            System.out.print(auxiliar + " ");
        }
    }
}
