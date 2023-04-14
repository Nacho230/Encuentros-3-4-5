/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro3_4_5_Ej08;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese el tamaño del Cuadrado");
             int num = leer.nextInt();
             for (int i = 0; i < num ; i ++){
             for(int j = 0; j < num ; j ++){
             if(i==0 || j ==0 || j==num -1 || i==num-1){
             System.out.print("*");
             }else{
                 System.out.print(" ");
             }
             }
             System.out.println();
             }
    }
}
    
    
    

