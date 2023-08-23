/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;

/**
 *
 * @author ianut
 */
public class AccountHistory {
    
    // member data
    
    private ArrayList<String> _accountHistory;
    
    // constructor
    public AccountHistory(ArrayList<String> accountHistory){ // putting the member data into the Constructor
        _accountHistory = accountHistory;
        
    }
    
    @Override
    public String toString(){ // Overriding method to print out the String rather than the pointer
        String toReturn = ""; // Making a local variable to avoid multiple returns
        for(int i = 0 ; i<_accountHistory.size() ; i++){ // Goes through each item in the array list
            toReturn = toReturn + _accountHistory.get(i) + "\n"; // Combines them into one large String that gets added to for every transaction
        }
        return toReturn;
    }
    
}
