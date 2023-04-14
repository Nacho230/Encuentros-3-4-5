/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro3_4_5_Ej06;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        //Realizar un programa que pida dos números enteros positivos por teclado 
        // y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
        //y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
//Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
//se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
//Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
Scanner leer = new Scanner(System.in);

        double num1, num2;
        int opcion;
        String res;
        System.out.println("Ingrese dos numeros: ");
        num1 = leer.nextDouble();
        num2 = leer.nextDouble();
        
        do{
            System.out.println("MENU\n"
                    +"1.Sumar\n"
                    +"2.Restar\n"
                    +"3.Multiplicar\n"
                    +"4.Dividir\n"
                    +"5.Salir\n"
               +"Ingrese una opcion\n");
            opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de los dos numeros ingresados es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta de los dos numeros ingresados es " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los dos numeros ingresados es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("La division de los dos numeros ingresados es: " + (num1 / num2));
                break;
            case 5:
                System.out.println("Seguro que quiere salir del programa? ");
                
                res = leer.nextLine();
                
                if (!res.equalsIgnoreCase("s")) {

                } else {
                    break;
                }
                break;
            default:
                System.out.println("Opcion incorrecta");

        }
        }while (opcion != 5);
        System.out.println("Hasta luego");
    }
    
    }


