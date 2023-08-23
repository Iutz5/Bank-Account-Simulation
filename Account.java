/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ianut
 */
public class Account {
    
    // memeber data
    
    private double _balance;
    private Customer _customer;
    private double _interestRate;
    private String _accountId;
    private AccountHistory _accountHistory;
    private ArrayList<String> _transactions;
    
    // constructor 
    
    public Account(double initialBalance, String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber,double interestRate, String accountId){ // putting member data into the constuctor
        //initializations
        _transactions = new ArrayList<String>();
        _balance = initialBalance;
        _customer = new Customer(firstName, lastName, streetAddress, city, state, zipCode, phoneNumber);
        _interestRate = interestRate;
        _accountId = accountId;
        _accountHistory = new AccountHistory(_transactions);
    }
    
    // accessors
    
    public double getBalance(){
        return _balance;
    }
    
    public Customer getCustomerInfo(){
        return _customer;
    }
    
    public double getInterestRate(){
        return _interestRate;
    }
    
    public String getAccountId(){
        return _accountId;
    }
    
    public AccountHistory getAccountHistory(){
        return _accountHistory;
    }
    
    public boolean deposit(double amount){ // puts money into the account
        _balance += amount; // adds account
        _transactions.add("D:"+amount + "   " + "Remaining Balance: $" + _balance); // adds into the ArrayList to be stored for AccountHistory
        return true; // shows that the deposit went through and that it works
    }
    
    public boolean withdraw(double amount){ // takes money out of the account
        boolean toReturn = true; // added a local boolean to avoid multiple return statements
        if(_balance >= amount){ // only works if the balance that is already in the account is greater than or equal to the amount that is wished to be withdrawn
            _balance -= amount; // subtracts account
            _transactions.add("W:"+amount + "   " + "Remaining Balance: $" + _balance); // adds into the ArrayList to be stored for AccountHistory
        } else {
            toReturn = false; // does not work if the balance is less than the amount that is wished to be withdrawn
        }
        return toReturn;
    }
    
    @Override
    public String toString(){ // Overriding String to print the String instead of the pointer
        return  _customer + "Account ID: "+ _accountId +"\n" + "Current Balance: " + _balance + "\n";
    }
    
    @Override
    public boolean equals(Object a){ // Overriding boolean to check deep equality between different accounts
        // self check
        if (this == a){
            return true;
        }
        // null check
        if (a == null){
            return false;
        }
        // type check and cast
        if (getClass() != a.getClass()){
            return false;
        }
        Account account = (Account) a;
        // field comparison
        return Objects.equals(_balance, account._balance)
                && Objects.equals(_customer, account._customer)
                && Objects.equals(_interestRate, account._interestRate)
                && Objects.equals(_accountId, account._accountId)
                && Objects.equals(_accountHistory, account._accountHistory)
                && Objects.equals(_transactions, account._transactions);
    }    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this._balance) ^ (Double.doubleToLongBits(this._balance) >>> 32));
        hash = 11 * hash + Objects.hashCode(this._customer);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this._interestRate) ^ (Double.doubleToLongBits(this._interestRate) >>> 32));
        hash = 11 * hash + Objects.hashCode(this._accountId);
        hash = 11 * hash + Objects.hashCode(this._accountHistory);
        hash = 11 * hash + Objects.hashCode(this._transactions);
        return hash;
    }
    // I have no idea what this hashcode does, but it changed my equals class from a yellow line to a green smiley face  
}
