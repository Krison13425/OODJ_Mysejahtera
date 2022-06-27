
package switchcaseprogram;

import java.util.*;

public class Switchcaseprogram {

    public static void main(String[] args) 
    {
   /*int opt;
    Scanner s = new Scanner(System.in);
    System.out.println("Here is your option:\n1. 6AM - 11:59 AM\n2. 12 Noon - 5PM\n3. 5PM - 8PM\n4. 8PM -12 night");
    System.out.println("Enter your Choice :");
    opt = s.nextInt();
    switch(opt)
    {
        case 1:
        {    
           System.out.println("Good Morning");
           break;
        }
        case 2:
        {    
           System.out.println("Good Afetrnoon");
           break;
        }
        case 3:
        {    
           System.out.println("Good Evening");
           break;
        }
        case 4:
        {    
           System.out.println("Good Night");
           break;
        }
        
        default:
        {    
           System.out.println("You entered wrong");
           break;
        }
    }*/
        //WAP to accept 2 numbers from user and do all arithmetic operations.
        //Display output as per users' choice for that operation only. (+,-,*,/)\
        
        
    int opt,no1,no2;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your Number :");
    no1 = s.nextInt();
    no2 = s.nextInt();
    System.out.println("Here is your option:\n1. Addition\n2. Subtraction\n3. Mulitiplication\n4. Division");
    System.out.println("Enter your Choice :");
    opt = s.nextInt();
    switch(opt)
    {
        case 1:
            int add;
            add = no1+no2;
           System.out.println("Addition is:"+add);
           break;
        
        case 2:
            
          int sub;
            sub = no1-no2;
           System.out.println("Subtraction is:"+sub);
           break;
        
        case 3:
         
           int mul;
            mul = no1*no2;
           System.out.println("Multiplication is:"+mul);
           break;
        
        case 4:
            
           int div;
            div = no1/no2;
           System.out.println("Division is:"+div);
           break;
        
        
        default:
            
           System.out.println("You entered wrong Choice");
           break;
        
    }
       
    }
    
}
