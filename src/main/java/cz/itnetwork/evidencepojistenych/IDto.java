/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public interface IDto {
    public void addPerson(IPerson person) throws Exception;
    public ArrayList<IPerson> searchPersons(String searchtText);
}
