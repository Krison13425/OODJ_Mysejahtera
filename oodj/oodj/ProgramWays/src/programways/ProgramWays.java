/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programways;

import java.util.*;

/**
 *
 * @author Kriso
 */
public class ProgramWays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int no;
      Scanner s =  new Scanner(System.in);
      System.out.println("Enter You values here:");
      no = s.nextInt();
      System.out.println("Value of number is:"+no);
      
      Display(no);
      
      StaticClass.StaticMethod(no);
      
      NormalClass nc = new NormalClass();
      nc.NormalMethod(no);
      
      GetSetClass gs = new GetSetClass();
      gs.SetData(no);
      System.out.println("GetSetClass. Value of number is :"+gs.GetData());
      
      ConstructorClass cc = new ConstructorClass(no);
      System.out.println("Constructor Class, Value of number is "+cc.result());
      
    }
    static void Display(int a)
    {
    System.out.println("Static inside same class. Value of number is :"+a);
    }
    
}
