/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.looping_e;

/**
 *
 * @author ALEXIS
 */
public class Looping_E {

    public static void main(String[] args) {
           for (int i=0; i>5; i--) {
            for (int j=0; j<5; j++) {
                System.out.print(i == j ? "*" : "0");
            } 
            System.out.println(" ");
        }
           
         int i=0;
        do {
            System.out.println(" ");
            int j=0;
            do {
                System.out.print(i==j ? "0" : "*");
                j++;
            }while (j<5);
            i++;
        } while (i<5);
           
           
           
    }
}
