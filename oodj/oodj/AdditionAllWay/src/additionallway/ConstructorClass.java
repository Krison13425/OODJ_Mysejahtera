/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionallway;

/**
 *
 * @author Kriso
 */
public class ConstructorClass 
{
    int ele1,ele2,add;

    ConstructorClass(int r,int s)
    {
        this.ele1 = r;
        this.ele2 = s;
    }
    
    int result ()        
    {
        add= ele1+ele2;
     return add;
    }
}
