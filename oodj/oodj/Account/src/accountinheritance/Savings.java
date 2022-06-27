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
public class Savings extends Account{
    
    public void withdrawal (double amount)
    {
        if(amount < getbal())
        {
            System.out.println("Insufficent balance in the account.");
        }
        else
        {
            super.withdrawal(amount);
        }
    }
}
