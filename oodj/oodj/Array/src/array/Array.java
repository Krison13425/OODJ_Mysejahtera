package array;

import java.util.Scanner;


public class Array {

    
    public static void main(String[] args) 
    {
        /*
        int i;
        int[] myarr = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 vlue in array :");
        for(i = 0; i<5;i++)
        {
            System.out.print("Enter Element :");
            myarr[i]= s.nextInt();
        }
        
        System.out.println("All arrat elements are:");
       for(i = 0; i<5;i++)
        {
            System.out.println(myarr[i]);
            
        }*/
        
        //WAP to accept size of an array. Accept elements from user as per defined size.
        //Display all array elements. Also display addition of all array elements at the end.
        /*
        int size ,i, add=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        size = s.nextInt();
        int[] myarr = new int[size];
        
        System.out.println("Enter value "+size+" in array :");
        
        for(i = 0; i<size; i++)
        {
            System.out.print("Enter myarr["+i+"]Element :");
            myarr[i]= s.nextInt();
        }
        
        System.out.println("All array elements are:");
       for(i = 0; i<size; i++)
        {
            System.out.println("myarr["+i+"]is : "+myarr[i]);
        }
       System.out.println("All array addition elements are:");
       for(i = 0;i<size; i++)
        {
            add = add+myarr[i] ;
        }
        System.out.println(add);
        */
        
        //WAP to display all even numbers from an array elements.
        
        /*
        int size ,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        size = s.nextInt();
        int[] myarr = new int[size];
        
        System.out.println("Enter value "+size+" in array :");
        
        for(i = 0; i<size; i++)
        {
            System.out.print("Enter myarr["+i+"]Element :");
            myarr[i]= s.nextInt();
        }
        
        System.out.println("All even value elements are:");
       for(i = 0; i<size; i++)
        {
            if(myarr[i]%2==0)
            {
            System.out.println(myarr[i]);
            }
        }
        */
        
        /*
        int i,j;
        int[][] myarr = new int[3][3];
        Scanner s = new Scanner (System.in);
        System.out.println("Enter elements in 2D Array");
        for(i=0 ; i<3; i++)
        {
            for(j=0 ; j<3 ; j++)
            {
                System.out.print("myarr["+i+"]["+j+"]: ");
                myarr[i][j] = s.nextInt();
            }
        }
        System.out.println("ALl elements in 2D Array are :");
        for(i=0 ; i<3; i++)
        {
            for(j=0 ; j<3 ; j++)
            {
                System.out.print("\t"+myarr[i][j]);
            }
             System.out.println();
        }
       */
        
        //WAP to accept size of an 2D array. Accept elements from user as per defined size.
        //Display all 2D array elements. Also display addition of all array elements at the end
        int i,j,row,col,add=0;
        int[][] myarr = new int[3][3];
        Scanner s = new Scanner (System.in);
        System.out.println("Enter row and column size of 2D array :");
        row = s.nextInt();
        col = s.nextInt();
        System.out.println("Enter elements in 2D Array");
        for(i=0 ; i<row; i++)
        {
            for(j=0 ; j<col ; j++)
            {
                System.out.print("myarr["+i+"]["+j+"]: ");
                myarr[i][j] = s.nextInt();
            }
        }
        System.out.println("ALl elements in 2D Array are :");
        for(i=0 ; i<row; i++)
        {
            for(j=0 ; j<col ; j++)
            {
                System.out.print("\t"+myarr[i][j]);
            }
             System.out.println();
        }
        
         System.out.println("addition elements in 2D Array are :");
        for(i=0 ; i<row; i++)
        {
            for(j=0 ; j<col ; j++)
            {
                add = add + myarr[i][j];
                
            }
        }
        System.out.println(add);
    }
    
}
