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
public class vehicle {
    
    private String myBrand, myMOdel;
    public vehicle()
    {
    myBrand = "unknown";
    myMOdel = "unknown";
    }
    
    public vehicle(String brand, String model)
    {
    setBrand(brand);
    setModel(model);
    }
    
    public String getBrand()
    {
    return myBrand;
    }

    public void setBrand(String brand)
    {
    myBrand = brand;
    }
    public String getModel()
    {
    return myMOdel;
    }
    public void setModel(String model)
    {
    myMOdel = model;
    }
    public String toString()
    {
        return getBrand() + " " +getModel();
    }
}
