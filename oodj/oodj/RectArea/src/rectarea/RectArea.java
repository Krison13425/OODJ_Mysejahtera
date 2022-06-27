/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectarea;

import java.util.*;

/**
 *
 * @author Kriso
 */
public class RectArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x,y,area2;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter Width and Height of Rectangle: ");
       x = s.nextInt();
       y = s.nextInt();
       
       Rectangle rect2 = new Rectangle();
       
       rect2.Data(x,y);
       area2 = rect2.rectArea();
       
       System.out.println("Area2 = "+ area2);
       
    }
    
}
