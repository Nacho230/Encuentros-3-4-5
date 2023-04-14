/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra;

/**
 *
 * @author nacho
 */
public class EjEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        int b = 2;
          int c = 3;
        int d = 4;
        
        System.out.println("Valores Iniciales;");
        System.out.println("a:" + a + ",b:" + b + ",c:" + c + ",d:" + d);
        
        int interna = b;
        b = c;
        c = a;
        a = d;
        int temperatura;
        d = interna ;
        
        System.out.println("valores finales");
        System.out.println("a:" + a + ",b:" + b + ",c:" + c + ",d:" + d);
    }
    

    private static class Temperatura {

        public Temperatura() {
        }
    }
}
    
    