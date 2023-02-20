/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

import java.time.LocalDate;



/**
 *
 * @author Martin
 */
public interface IPerson {
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    Integer getAge();
    LocalDate getDateOfBirth();
    String getSearchNeedle();
}