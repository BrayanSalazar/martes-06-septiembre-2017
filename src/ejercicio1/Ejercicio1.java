/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Random;

/**
 *
 * @author Brayan
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d1, d2, d3;
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        
        d1 = r1.nextInt(6)+1;
        d2 = r2.nextInt(6)+1;
        d3 = r3.nextInt(6)+1;
        
        System.out.println("El primer dado es :"+d1);
        System.out.println("El primer dado es :"+d2);
        System.out.println("El primer dado es :"+d3);    
        
        int suma =0;
        if(d1==6&&d2==6&&d3==6){
            suma++;
            System.out.println("Exalente");
        }else if(d1==6&&d2==6){
            suma++;
            System.out.println("Muy bien");
        }else if(d2==6&&d3==6){
            suma++;
            System.out.println("Muy bien");
        }else if(d1==6&&d3==6){
            suma++;
            System.out.println("Muy bien");
        }else if(d1==6){
            suma++;
            System.out.println("Regular");
        }else if(d2==6){
            suma++;
            System.out.println("Regular");
        }else if(d3==6){
            suma++;
            System.out.println("Regular");
        }else{
            System.out.println("Pesimo");
        }         
    }    
}
