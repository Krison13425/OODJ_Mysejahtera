/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectarea;

/**
 *
 * @author Kriso
 */
public class Rectangle {
    int length, width;
    
        void Data(int x,int y)
        {
            length = x;
            width = y;
        }
        
        int rectArea()
        {
        int area = length * width;
        return(area);
        
        }
}
