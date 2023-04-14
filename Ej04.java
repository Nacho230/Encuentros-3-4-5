/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro3_4_5_Ej04;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escriba un programa que pida una frase o 
        //y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, 
        //se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
        //se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        if (frase.substring(0,1).equalsIgnoreCase("a" )){
            System.out.println("Correcto");
        }else{
                  System.out.println("Incorrecto");
                    }
        }
    }
                

