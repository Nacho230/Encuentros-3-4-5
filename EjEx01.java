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
public class EjEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int min = leer.nextInt();
        int dias = min/(24*60);
        int horas = min%(24*60)/60;
        System.out.println(min + "minutos equivalentes a " + dias + "dias y " + horas + "horas.");
    }
}
    
    
