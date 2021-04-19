/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ginaozimisa
 */
public class Ejercicio08 {

    String telegrama;

    public Ejercicio08() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese telegrama");
        this.telegrama = sc.nextLine();
    }

    public void precio() {
        int precio = 500;
        StringTokenizer st = new StringTokenizer(telegrama);
        int n = st.countTokens();
        if (n > 50) {
            precio = precio + (5 * (st.countTokens() - 50));
        }
        System.out.println("El precio es: $" + precio);
    }

}
