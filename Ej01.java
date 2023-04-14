/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro3_4_5_Ej01;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args)  {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
       
         
        if (num % 2 == 0){
            System.out.println("Es par");
        } else {
            System.out.println("Es Inpar");
        }
        
        
    }
    }