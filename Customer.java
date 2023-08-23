/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author ianut
 */
public class Customer {
    
    // memeber data
    
    private String _firstName;
    private String _lastName;
    private String _streetAddress;
    private String _city;
    private String _state;
    private String _zipCode;
    private String _phoneNumber;
    
    // constructor 
    public Customer(String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber) { // putting member data into the constuctor
        // initializations
        _firstName = firstName;
        _lastName = lastName;
        _streetAddress = streetAddress;
        _city = city;
        _state = state;
        _zipCode = zipCode;
        _phoneNumber = phoneNumber;
        
    }
    
    // accessors
    public String getFirstName(){
        return _firstName;
    }
    
    public String getLastName(){
        return _lastName;
    }
    
    public String getStreetAddress(){
        return _streetAddress;
    }
    
    public String getCity(){
        return _city;
    }
    
    public String getState(){
        return _state;
    }
    
    public String getZipCode(){
        return _zipCode;
    }
    
    public String getPhoneNumber(){
        return _phoneNumber;
    }
    
    // mutators
    public String setFirstName(String firstName){
        _firstName = firstName;
        return _firstName;
    }
    
    public String setLastName(String lastName){
        _lastName = lastName;
        return _lastName;
    }
    
    public String setStreetAddress(String streetAddress){
        _streetAddress = streetAddress;
        return _streetAddress;
    }
    
    public String setCity(String city){
        _city = city;
        return _city;
    }
    
    public String setState(String state){
        _state = state;
        return _state;
    }
    
    public String setZipCode(String zipCode){
        _zipCode = zipCode;
        return _zipCode;
    }
    public String setPhoneNumber(String phoneNumber){
        _phoneNumber = phoneNumber;
        return phoneNumber;
    }
    
    @Override
    public String toString(){ // Overriding the String method to print out the String rather than the pointer
        return "Customer: " + _firstName + " " + _lastName + "\n" + "Address: " + _streetAddress + "\n" + "City: " + _city + "\n" + "State: " + _state + "\n" + "ZIP Code: " + _zipCode + "\n" + "Phone Number: " + _phoneNumber + "\n";
    }
}
