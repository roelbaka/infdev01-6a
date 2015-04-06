/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario01;

public class OrderManager {

    public OrderManager(Order order) {     
        // Set order status to processing
        System.out.println("is processing: "+ order.isProcessing());
        order.setProcessing();
        System.out.println("is processing: "+ order.isProcessing());
        System.out.println("Order: " + order.getOrderID() + ", from client: " + order.getClientID() + " is processing");
        
        // Zet de staat van de bestelling op “Compleet” als de huidige tijdstempel hoger dan de som van “start tijd” en “duur” is
        order.setComplete();
        
        System.out.println("Order is complete, duration: " + order.getDuration());
    }
}