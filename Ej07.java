/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro3_4_5_Ej07;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        int  aux1,aux2;
        aux1=0;
        aux2=-1;
                
        do{
        System.out.println("Ingrese una cadena");
        frase = leer.nextLine();
         if(frase.length() == 5 && frase.substring(0,1).equalsIgnoreCase("x") && frase.substring(3,4).equalsIgnoreCase("o"))
             aux1 = aux1+1;
         else{
             aux2= aux2+1;
                     }
         
             }while(!frase.equals("&&&&&"));
            
        System.out.println("Las cantidad de cadenas correctas fueron: \n  " + aux1
                + " Y las cadenas incorrectas son: "  + aux2);
        }
        
    }
    

