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
public class Ejercicio21 {

    int numeroIngresado;

    public Ejercicio21() {
    }

    public int factorial(int numeroIngresado) {
        if (numeroIngresado == 0) {
            return 1;
        } else {
            return numeroIngresado * factorial(numeroIngresado - 1);
        }

    }
}
