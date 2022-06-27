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
public class GetSetClass 
{
    int value1,value2, add;
    void SetData1 (int k,int l)
    {
        value1 = k;
        value2 = l;
    }
  
    int GetData()
    {
        add = value1+value2;
        return add;
    }
}
