/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.looping_f;

/**
 *
 * @author ALEXIS
 */
public class Looping_f {

    public static void main(String[] args) {
        
         
        
        
        for (int i=5; i>0; i--){
            System.out.print("");
            for ( int j=0; j<5; j++){
                System.out.print(i < 2 ? "0" : "*");
            }
            System.out.println("0");
        }
    

    

int i=5;
        
        while (i > 0){
            System.out.println("");
            int j=0;
            while (j < 5){
                System.out.print(i < 2 ? "0" : "*");
                j++;
            }
            System.out.println("0");
            i--;
        }
    }
}