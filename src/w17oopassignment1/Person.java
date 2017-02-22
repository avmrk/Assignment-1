/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17oopassignment1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author AV
 */
public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String province;
    private String postalCode;
    private LocalDate birthdate;
    

   public Person(String first, String last, String address, String place, String state,
                                                 String zipcode, LocalDate dob)
   {
       firstName = first; 
       lastName = last;
       streetAddress = address;
       city = place;
       province = state;
       setPostalcode(zipcode);
       setBirthday(dob);
   
   } 

   /** this will validate the birthyear and throw an illegalargumentexception 
    * if year is greater than current year */
   
    private void setBirthday(LocalDate dob) 
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();
        
        if (age >=0)
            birthdate =dob;
        else
            throw new IllegalArgumentException("Invalid input: Year should be less than or equal to current year");
    }

    /**this method will count the number of letter and throw illegalargumentexception
     *if it is more than 6*/
    
    private void setPostalcode(String zipcode) {
        int length = postalCode.length();
        if ( length >= 6)
            postalCode = zipcode;
        else
        throw new IllegalArgumentException("Postal should contain 6 characters");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    
// get method to return age
    private int getAge() {
       LocalDate today = LocalDate.now();
        LocalDate bday = birthdate;
        int age = Period.between(bday, today).getYears();
        return age;
    }
// this getter will return the full address in the following format
private String getFullAddress() {
    return streetAddress+"," +city+","+ province+ ","+ postalCode;
}
    
}
