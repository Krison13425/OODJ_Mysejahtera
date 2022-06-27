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
public class CheckingAccount extends Account {
    
    public void withdrawal (double amount)
    {
        double limit = 1000.00;
        double overdraft;
        double bal = getbal();
        
        if(bal > amount)
        {
            overdraft = bal - amount;
            if(overdraft < limit)
                System.out.println("Insufficent balance in the account. You have an overdraft liit of " + limit);
            
        }else
        {
            super.withdrawal(amount);
        }
            
            
    }
}
