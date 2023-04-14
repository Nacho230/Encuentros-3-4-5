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
public class EjEx06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas:");
        int personas = leer.nextInt();
        int per = 0;
        double altbaja = 0;
        double altgeneral = 0;
        double sumbaja = 0;
        double sumgeneral = 0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona " + per);
            per++;
            double alt = leer.nextDouble();
            if (alt < 1.60) {
                altbaja = (altbaja + 1);
                altgeneral = (altgeneral + 1);
                sumbaja = (sumbaja + alt);
                sumgeneral = (sumgeneral + alt);
            } else {
                altgeneral = (altgeneral + 1);
                sumgeneral = (sumgeneral + 1);
            }
        }
        System.out.println("Altura promedio menor a 1.60: " + (sumbaja / altbaja));
        System.out.println("Altura promedio general: " + (sumgeneral / personas));
    }
}
        
    
