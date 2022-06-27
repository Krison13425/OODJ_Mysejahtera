
package basicprogram;

import java.util.*;

public class BasicProgram {
    

    public static void main(String[] args) {
       /*
        System.out.println("Hello WOrld");
        System.out.println("Welcaome to APU");
        System.out.println("This is OODJ Class.");
       
        System.out.println("Hello World.\n Welcome to Apu.\n\t This is OODJ Class.");
        
        //Wap to accept value in program and display it.
        int no;
        no =100;
        System.out.println("your value is:"+no);

          //Wap to accept value from user and display it
          int no;
          double nol;
          String name,name1;
          Scanner s = new Scanner(System.in);
          
          System.out.println("KIndly enter your name here:");
          name1 = s.nextLine();
         System.out.println("YOur value is :"+name1);
          
          System.out.println("KIndly enter your value here:");
          no = s.nextInt();
          System.out.println("YOur value is :"+no);
         
          System.out.println("KIndly enter your decimal value here:");
          nol = s.nextDouble();
          System.out.println("YOur decimal value is :"+nol);
          
          System.out.println("KIndly enter your name here:");
          name = s.next();
          System.out.println("YOur value is :"+name);
        */
            //wap to accept 2 numbers drom user and display addition of it
            /*int no1,no2,add;
            Scanner s = new Scanner(System.in);
            
            System.out.println("KIndly enter your first number here:");
            no1 = s.nextInt();
            System.out.println("KIndly enter your second number here:");
            no2 = s.nextInt();
            
            add= no1+no2;
            System.out.println("YOur first number is :"+no1);
            System.out.println("YOur second number is :"+no2);
            System.out.println(no1+"+"+no2+"="+add);*/
            
            //WAP to accept 2 numbers from users and do all arithemetic operation. Display output for all operation.(+,-,*,/)
//            int no1,no2,add,sub,mul;
//            float div;
//            Scanner s = new Scanner(System.in);
//            System.out.println("Kindly enter 2 values here:");
//            no1 = s.nextInt();
//            no2 = s.nextInt();
//            
//           add = no1+no2;
//           System.out.println("Addition is:"+add);
//           sub = no1-no2;
//           System.out.println("Subtraction is:"+sub);
//           mul = no1*no2;
//           System.out.println("Multiplication is:"+mul);
//           div = no1/no2;
//           System.out.println("Division is:"+div);
//   
int n= 9001;
int sum = 0;

 while (n > 0) {

 sum += n % 10;

 n /= 10;
          

    }
        System.out.println(n);
    
}}
