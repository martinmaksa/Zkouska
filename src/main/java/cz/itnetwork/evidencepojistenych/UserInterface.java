/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class UserInterface {
    private Scanner sc = new Scanner(System.in, "Windows-1250");
    private IDto dto;
    public UserInterface(IDto dto) {
        this.dto = dto;
    }

    public static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd'.'MM'.'yyyy");
    
    public void start() {
        System.out.println("Main menu");
        System.out.println("");
        System.out.println("Enter the choice");
        System.out.println("1. Add person");
        System.out.println("2. Find person");
        System.out.println("3. Display a list of all persons");
        System.out.println("4. End of program");

        String choice = "";
        while (!choice.equals(4)) {
            choice = this.sc.nextLine();
        switch (choice) {
            case "1":
                this.addPerson();
                break;
            case "2":
                this.searchPersons();
                break;
            case "3":
                this.displayAllPersons();
                break;
            case "4":
                System.out.println("Thank you for using this app :-)");
                return;
            default:
                System.out.println("Invalid choice, press any button and try again");
                break;
            }
        }
    }

    protected void addPerson() {
        try {
            this.dto.addPerson(new Person(this.readText("First name:"), this.readText("Last name:"), this.readText("Phone number:"), this.readDate("Date of birth:")));
        } catch (Exception e) {
            System.out.println("Adding user failed, user already exists");
        }
    }

    protected void searchPersons() {
        ArrayList<IPerson> result = this.dto.searchPersons(this.readText("Search:"));
        System.out.println("Found " + result.size() + " items:");
        this.renderPersons(result);
    }

    protected void displayAllPersons() {
        ArrayList<IPerson> result = this.dto.searchPersons(null);
        System.out.println("Count " + result.size() + " items:");
        this.renderPersons(result);
    }

    /**
     * This method will render array list of persons in structured data
     */
    protected void renderPersons(ArrayList<IPerson> persons) {
        for (int i = 0; i < persons.size(); i++) {
            IPerson person = persons.get(i);
            System.out.println("Name: " + person.getFirstName() + " " + person.getLastName() + " Phone: " + person.getPhoneNumber() + " Age: " + person.getAge().toString());
        }
    }

    /**
     * This method will write message and waits until user input some text ends with new line.
     */
    protected String readText(String message) {
        while(true) {
            System.out.println(message);
            try {
                return this.sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid user input");
            }
        }
    }

  /**
     * This method will write message and waits until user input date in correct format.
     */
    protected LocalDate readDate(String message) {
        while (true) {
            System.out.println(message);
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d'.'M'.'yyyy");
                return LocalDate.parse(this.sc.nextLine(), formatter);
            } catch (Exception e) {
                System.out.println("Invalid date format input");
            }
        }
    }
}