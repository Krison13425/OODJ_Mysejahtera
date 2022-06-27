/* 
WAP to accept 2 numbers from user and display addition of those numbers
by using following ways
1. Structure Way
2. Static Way
2.1 inside same class
2.2 inside different class
3. Object Oriented Way
3.1 Normal Method Way
3.2 GetSet Way
3.3 Constructor Way
*/
package additionallway;

import java.util.Scanner;


public class AdditionAllWay {

    public static void main(String[] args) {
      
      int no1, no2, add;
      Scanner s =  new Scanner(System.in);
      System.out.println("Enter two values here:");
      no1 = s.nextInt();
      no2 = s.nextInt();
      add = no1+no2;
      System.out.println("Addition Value of two numbers is:"+add);
      
      Display(no1,no2);
      
      StaticClass.StaticMethod(no1,no2);
      
      NormalClass nc = new NormalClass();
      nc.NormalMethod(no1,no2);
      
      GetSetClass gs = new GetSetClass();
      gs.SetData1(no1,no2);
      System.out.println("GetSetClass. addition Value of 2 number is :"+gs.GetData());
      
      ConstructorClass cc = new ConstructorClass(no1,no2);
      System.out.println("Constructor Class, addtion Value of 2 number is "+cc.result());
      
    }
    static void Display(int a,int b)
    {
        int add;
        add = a+b;
    System.out.println("Static inside same class. addtion Value of number is :"+add);
    }
}
