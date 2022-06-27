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
public class Accountinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Account ac = new Account();
     ac.setAcno(1122);
     ac.setBal(20000);
     ac.withdrawal(2500.00);
     System.out.println(ac.toString());
     
     CheckingAccount CA = new CheckingAccount();
     CA.setAcno(15);
     CA.setBal(30000);
     CA.setIntRate(4.5);
     CA.withdrawal(500);
     System.out.println(CA.toString());
     
     Savings SA = new Savings();
     SA.setAcno(10);
     SA.setBal(30000);
     SA.setIntRate(4.5);
     SA.withdrawal(500);
     System.out.println(SA.toString());
     
     
    }
    
}
