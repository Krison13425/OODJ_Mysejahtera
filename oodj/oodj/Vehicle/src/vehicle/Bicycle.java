/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Kriso
 */
public class Bicycle extends vehicle {
    
    private int myGearCount;
    public Bicycle()
    {
        myGearCount = 1;
    }
    public Bicycle(int gearCount)
    {
        setGearCount(gearCount);
    }
    public int GetGearCount()
    {
        return myGearCount;
    }
    
    public void setGearCount(int gearCount)
    {
        myGearCount =  gearCount;
    }
}
