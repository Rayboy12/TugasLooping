/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loopin_a;

/**
 *
 * @author ALEXIS
 */
public class Loopin_A {

    public static void main(String[] args) {
          for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"");
            }
            System.out.println("");
        }
          
        int   i=5;
        do {
            System.out.println("");
            int j=1;
            do {
                System.out.print(j+"");
                j++;
            } while (j<=i);
            i--;
        }while (i >=1);
          
          
          
          
    }
}
