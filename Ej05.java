/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro3_4_5_Ej05;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escriba un programa en el cual se ingrese un valor límite positivo, 
        //y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        Scanner leer = new Scanner(System.in);
        int numero, suma, limite;
        System.out.println("Ingrese un numero limite ");
        limite = leer.nextInt();
        suma=0;
        
     do{
         
         System.out.println("Ingrese un numero");
         numero = leer.nextInt();
         suma = suma + numero;
         
     }while(suma < limite && suma != limite);
             
    
        System.out.println("Se paso del limite");
                
        System.out.println("El total de la suma es " + suma);
    }
    }


  

  

  
     