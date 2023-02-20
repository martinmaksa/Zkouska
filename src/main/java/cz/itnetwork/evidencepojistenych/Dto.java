/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Dto implements IDto {
    private ArrayList<IPerson> persons;
    public Dto() {
        this.persons = new ArrayList();
    }

    @Override
    public void addPerson(IPerson person) throws Exception {
        if(this.persons.stream().anyMatch(x -> x.getFirstName().equals(person.getFirstName()) && x.getLastName().equals(person.getLastName()) && x.getDateOfBirth().isEqual(person.getDateOfBirth()))) {
            throw new Exception("Person already exists");
        }
        this.persons.add(person);
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName() + " added corectly");
    }

    @Override
    public ArrayList<IPerson> searchPersons(String searchText) {
        if (searchText == null) {
            return new ArrayList(this.persons);
        }
        return new ArrayList(this.persons.stream().filter(x -> x.getSearchNeedle().contains(searchText)).toList());
    }
}
