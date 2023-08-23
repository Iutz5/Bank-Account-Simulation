/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw0;

import Bank.*;

/**
 *
 * @author ianut
 */
public class HW0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a1 = new Account(150,"John","Wayne","601 E Main St.","Collegeville","Pennsylvania","19426","(610)955-7835",8.25,"JWBank22"); // instantiating the first Account with customer information
        
        a1.deposit(100);
        a1.deposit(250);
        a1.withdraw(500);
        System.out.println(a1.getAccountHistory());
        a1.deposit(100);
        a1.withdraw(75);
        a1.withdraw(150);
        System.out.println(a1.getAccountHistory());
        a1.deposit(500);
        System.out.println(a1.getAccountHistory());
        
        System.out.println(a1); // Printing the first Account information to the Screen
        
        Account a2 = new Account(150,"John","Wayne","601 E Main St.","Collegeville","Pennsylvania","19426","(610)955-7835",8.25,"JWBank23"); // instantiating the second account with Customer information
        
        a2.deposit(100);
        a2.deposit(250);
        a2.withdraw(500);
        System.out.println(a2.getAccountHistory());
        a2.deposit(100);
        a2.withdraw(75);
        a2.withdraw(150);
        System.out.println(a2.getAccountHistory());
        a2.deposit(500);
        System.out.println(a2.getAccountHistory());
        
        System.out.println(a2); // Printing the second Account information to the Screen
        
        String aString = a1.toString(); // Converting the first account information to a String
        String bString = a2.toString(); // Converting the second account information to a different String
        System.out.println(aString.equals(bString)); // Comparing the Strings for deep Equality
        // My attempt at the extra Credit
        
    }
    
}
