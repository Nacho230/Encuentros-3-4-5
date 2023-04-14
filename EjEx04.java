/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjEx04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero, DALE :  ");
        try {
        int numero = leer.nextInt();
        if (numero>=1 && numero<=10){
         switch (numero) {
           case 1:
            System.out.println(" I ");
            break;
        case 2:
            System.out.println(" II ");
            break;
        case 3:
            System.out.println(" III ");
            break;
        case 4:
            System.out.println(" IV");
            break;
        case 5:
            System.out.println(" V ");
            break;
        case 6:
            System.out.println(" VI ");
            break;
        case 7:
            System.out.println(" VII ");
            break;
        case 8:
            System.out.println(" VIII ");
            break;
        case 9:
            System.out.println(" IX ");
            break;
        case 10:
            System.out.println(" X ");
            break;
        default:
            
        }}else{
                System.out.println(" INGRESA UN NUMERO DEL 1 al 10 ");
                System.out.println(" *********** ADIOS ************* ");
                }
       
           }catch(InputMismatchException e) {
            System.out.println("Debes ingresar un numero ");
            leer.next();
           
           }
}
}
    