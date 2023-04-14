/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro3_4_5_Ej02;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
      Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una Frase");
        
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("Eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
     
    }

}
    