/*
 * Scenario 1
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
package scenario01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johnson
 */
public class PhotoShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create clients
        List<Client> clientList = new ArrayList<>();
        clientList.add(new Client("lastName01", "suffix01", "firstName01", 31, 'F', "City01", "emailAddress01"));
        clientList.add(new Client("lastName02", "suffix02", "firstName02", 32, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("lastName03", "suffix03", "firstName03", 33, 'F', "City03", "emailAddress03"));
        clientList.add(new Client("lastName02", "suffix02", "firstName02", 32, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("lastName02", "suffix02", "firstName02", 32, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("lastName02", "suffix02", "firstName02", 32, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("lastName02", "suffix02", "firstName02", 32, 'F', "City02", "emailAddress02"));
        clientList.add(new Client("lastName02", "suffix02", "firstName02", 32, 'F', "City02", "emailAddress02"));

        // Create order queue
        OrderQueue orderQueue  = new OrderQueue();
        OrderQueue urgentQueue = new OrderQueue();

        for (Client clientList1 : clientList) {
            Order order = new Order(clientList1.getID(), (Math.random() < 0.5));
            
            // Set order status to waiting
            order.isAwaitOrder();
            
            // Add clientOrders to queue 
            if (order.getUrgent() == true) {
               urgentQueue.enqueue(order);
            } else{
               orderQueue.enqueue(order);
            }
        }
        
        // Send order queue to order manager
        System.out.println("Orders in urgentQueue: " + urgentQueue.getSize());
        System.out.println("Orders in orderQueue: "  + orderQueue.getSize());
        
        //loop urgentQueue and orderQueue
        while (urgentQueue.hasItems() || orderQueue.hasItems()) {

            //if there are urgentItems, do the urgentItems
            if(urgentQueue.hasItems()){
                System.out.println("\nOrders in urgentQueue: " + urgentQueue.getSize());
                new OrderManager(urgentQueue);
            }
            
            //if there are no urgentItemes, but there are orderItems, do the orderItems
            if(orderQueue.hasItems() && !urgentQueue.hasItems()){
                System.out.println("\nOrders in orderQueue: " + orderQueue.getSize());
                new OrderManager(orderQueue);
            }
        }
    }
}


