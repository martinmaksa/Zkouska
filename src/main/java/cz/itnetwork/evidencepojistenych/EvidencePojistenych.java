/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.evidencepojistenych;

/**
 *
 * @author Martin
 */
public class EvidencePojistenych {
    static UserInterface userInterface;
    static Dto dto;

    public static void main(String[] args) {
        EvidencePojistenych.dto = new Dto();
        EvidencePojistenych.userInterface = new UserInterface(EvidencePojistenych.dto);
        EvidencePojistenych.userInterface.start();
    }
}
