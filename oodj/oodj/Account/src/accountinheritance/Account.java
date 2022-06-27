/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountinheritance;

/**
 *
 * @author Kriso
 */
public class Account {
    
    private int accnum;
    private double balance;
    private double annitrate;
    
    Account()
    {}
    
    public void setAcno (int acno)
    {
        accnum = acno;
    }
    
    public int gettAcno ()
    {
        return accnum;
    }
    
    public void setBal (double bal)
    {
    balance = bal;
    }
    
    public double getbal ()
    {
        return balance;
    }
    
    public void setIntRate (double annintrate)
    {
        this.annitrate = annintrate;
    }
    
    public double getInRate()
    {
        return annitrate;
    }
    
    public void deposit(double amount)
    {
        balance = balance + amount ;
        
    }
    
    public void withdrawal (double amount)
    {
        balance = balance - amount;
    }
    
   public String toString()
   {
       return "\n Account no:"+gettAcno()+"\n Balance:" +getbal();
   }
}
