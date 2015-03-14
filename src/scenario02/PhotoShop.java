/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario02;

import java.util.ArrayList;
import java.util.List;
import java.util.*; 

/*
 * Scenario 2
 * 
 * Denk na over het bestellingen-gegevensbestand. Stel dat de winkel maar twee drukkers heeft 
 * (een voor de “dadelijk” bestellingen, een voor de anderen, omdat ze langer duren). 
 * Elke drukker verwerkt de bestellingen als ze binnen komen. De verwerking van bestellingen 
 * volgt een FIFO patroon, dus gebruikt de winkel een queue-data-structuur voor elke drukker om de bestellingen op te slaan.
 * -     Implementeer een queue datastructuur.
 * --    Implementeer de invoegprocedure (wanneer een klant een nieuwe bestelling maakt) en de verwijder procedure 
 *       (wanneer een bestelling compleet is).
 * ---   Om de bijgewerkte staat van de bestelling te behouden, implementeer de update procedure die checkt de 
 *       tijdstempel van bestellingen en…:
 * ----  Zet de staat van de bestelling op “Compleet” als de huidige tijdstempel hoger dan de som van “start tijd” en “duur” is
 * ----  Zet de staat van de bestelling op “Verwerking” als er is geen andere bestelling in verwerking staat en deze bestelling de volgende te verwerken is. In dit geval, zet de “start tijd” waarde ook op de huidige tijdstempel.
 */

/**
 *
 * @author Roel
 */
public class PhotoShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create clients
        ArrayList<Client> clientList = new ArrayList<>();
        clientList.add(new Client("Bakker", "", "Roel", 27, 'F', "City01", "emailAddress01"));
        clientList.add(new Client("Mpaulo", "", "Emauel", 24, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("Rotterdam", "suffix03", "oost", 29, 'F', "City03", "emailAddress03"));
        clientList.add(new Client("Amsterdam", "suffix02", "west", 19, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("Utrecht", "suffix02", "firstName02", 42, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("Pim", "suffix02", "Pom", 132, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("Bob", "suffix02", "sorteer", 232, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("tafel", "suffix02", "stoel", 332, 'F', "City02", "emailAddress02"));
        
        
        LinearSearch search = new LinearSearch();
        System.out.println(search.linearSearch(clientList, "tafel"));
        System.out.println(search.linearSearch(clientList, 27));
        
        //used collections framework, instead of looking for a mergesort script
        ClientAgeComparator comparator = new ClientAgeComparator();
        Collections.sort(clientList, comparator);

        for (Client client : clientList) {
            System.out.println(client.getFirstName());
        }
    }
}