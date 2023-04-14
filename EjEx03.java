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
public class EjEx03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
        //Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = leer.nextLine();
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||  letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("i")){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
        
               
    }
    
}
