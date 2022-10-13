/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.looping_d;

/**
 *
 * @author ALEXIS
 */
public class Looping_D {

    public static void main(String[] args) {
         for (int i=5; i>0; i--) {
             System.out.print("0");
             for (int j=0; j<5; j++){
                System.out.print(i >4 ? "0" : "*");
            }
            System.out.println("");
        }
         
         
        System.out.println(" ");
        
            int i = 5;
        
        while(i > 0){
            System.out.print("0");
            int j = 0;
            while(j < 5){
                System.out.print(i > 4 ? "0" : "*");
                j++;
            }
            System.out.println("");
            i--;
        }
        
        
    }
}
   

