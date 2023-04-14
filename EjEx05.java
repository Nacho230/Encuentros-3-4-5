/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjEx05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la Clase del Socio (A,B,C.): ");
        String letra = leer.nextLine();
        System.out.print("Ingrese el costo del tratamiento:");
        int costo = leer.nextInt();
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("Total a abonar:");
            System.out.println((costo * 0.5));
        } else if (letra.equalsIgnoreCase("b")) {
            System.out.println("Total a abonar:");
            System.out.println((costo * 0.65));
        } else if (letra.equalsIgnoreCase("c")) {
            System.out.println("Total a abonar:");
            System.out.println(costo);
        }
    }
}
    
