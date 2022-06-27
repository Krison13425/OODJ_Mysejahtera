/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author Kriso
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int i = 0 ;
       Scanner s =  new Scanner(System.in);
       System.out.println("Enter values to find number:");
       int n = s.nextInt();
       
       while (i<=n)
        {
              if(i == 5)
              {
                  System.out.println("Found");
                  return;
              } 
              else
              {
                  i = i + 1;
                  System.out.println("Not Found");
              }
               
        }
    }
    
}
