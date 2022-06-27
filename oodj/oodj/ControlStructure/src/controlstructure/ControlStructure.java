
package controlstructure;

import java.util.*;

public class ControlStructure {

    public static void main(String[] args) {
       
        /* Control Structure : used to check condition once and execute output once
        1. if
        Syntax
            if(condition)
                Statement;
        2. if-else
        Syntax
            if(condition)
                Statement 1;
            else
                Statement 2;
        
        3. nested if-else
        Syntax
            if(condition 1)
                Statement 1;
            else if(condition 2)
                Statement 2;
            .
            .
            else if(condition n)
                Statement n;
            else
                Statement;
        
        //WAP to check given number is positive number
        int no;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value here");
        no = s.nextInt();
        
        if(no>0)
        {
            System.out.println("No. is Possitive");
        }
        
        //WAP to check given number is positive number or Negative number
        int no;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value here");
        no = s.nextInt();
        
        if(no>0)
        {
            System.out.println("No. is Possitive");
        }
        else
            System.out.println("No. is Neagtive");
        
        //WAP to check given number is zero,positive number or Negative number
        int no;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value here");
        no = s.nextInt();
        
        if(no==0)
        {
            System.out.println("No. is Zero");
        }
        else if(no>0)
        {
            System.out.println("No. is Possitive");
        }
        else
            System.out.println("No. is Neagtive");
        */
        
        //WAP to print largest number between 2 numbers
        /*
        no1     no2     ouput
        0       0       All zero
        9       9       All equal
        9       6       no1 Largest
        5       8       no2 Largest
        */
        /*
        int no1,no2;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 2 numbers here");
        no1 = s.nextInt();
        no2 = s.nextInt();
        
        if(no1 == 0 && no2 == 0)
        {
           System.out.println("All Zero");
        }
        else if(no1 == no2)
        {
            System.out.println("All Equal");
        }
        else if(no1 > no2)
        {
            System.out.println("no1 is Largest");
        }
        else 
        {
            System.out.println("no2 is Largest");
        }
            */
        
        
        /*
        WAP to print the Total,Percentange(average) and Gade of a student by accepting student name, tpnumber and 5 subjects marks
        (Note: A+ 100 - 80    A 80 - 75     b+ 75 - 70
               B  70 - 65     c+ 65 - 60    C 60- 55
               C- 55 - 50     d 50 - Below)
        */
        String name;
        int tp,s1,s2,s3,s4,s5,total;
        float avg;
        
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Your Name :");
        name = s.nextLine();
        System.out.println("Enter Your TP Number :");
        tp = s.nextInt();
        System.out.println("Enter 5 Subject marks :");
        s1 = s.nextInt();
        s2 = s.nextInt();
        s3 = s.nextInt();
        s4 = s.nextInt();
        s5 = s.nextInt();
        
        total = s1+s2+s3+s4+s5;
        avg =total/5;
        
        System.out.println("\n\t Welcome to APU\n\tGrade System\nStydent Name\t\t:"+name+"\nStudent TP Number\t: TP"+tp);
        System.out.println("All Subject Marks\t:"+s1+" , "+s2+" , "+s3+" , "+s4+" , "+s5);
        System.out.println("Total is\t\t:"+total+"\nAverage is\t\t:"+avg);
        if(avg <= 100 && avg >=80)
        {
        System.out.println("Grade is A+");
        }
        else if(avg < 80 && avg >=75)
        {
        System.out.println("Grade is A");
        }
        else if(avg < 75 && avg >=70)
        {
        System.out.println("Grade is B+");
        }
        else if(avg <= 70 && avg >=65)
        {
        System.out.println("Grade is B");
        }
        else if(avg <= 65 && avg >=60)
        {
        System.out.println("Grade is C+");
        }
        else if(avg < 60 && avg >=55)
        {
        System.out.println("Grade is C");
        }
        else if(avg < 55 && avg >=50)
        {
        System.out.println("Grade is C-");
        }
        else
        {
        System.out.println("Grade is D");
        }
    }
    
    
}
