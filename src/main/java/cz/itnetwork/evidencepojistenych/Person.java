/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Martin
 */
public class Person implements IPerson {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    

   
    public Person(String firstName, String lastName, String phoneNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public Integer getAge() {
        return (int)ChronoUnit.YEARS.between(this.dateOfBirth, LocalDate.now());
                
    }

    @Override
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public String getSearchNeedle() {
        return this.firstName + " " + this.lastName;
    }
    
}
