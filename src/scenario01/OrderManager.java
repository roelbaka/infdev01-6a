/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario01;

/**
 *
 * @author Johnson
 */
public class OrderManager {
    
    public OrderManager(OrderQueue orderQueue) {
        Order order = (Order)orderQueue.peek();
     
        // Set order status to processing
        order.isProcessing();
        
        System.out.println("Order: " + ((Order)orderQueue.peek()).getOrderID() + ", from client: " + ((Order)orderQueue.peek()).getClientID() + " is processing");
        
        // Zet de staat van de bestelling op “Compleet” als de huidige tijdstempel hoger dan de som van “start tijd” en “duur” is
        order.isComplete();
        
        
        System.out.println("Order is complete, duration: " + order.getDuration());
        
        // Remove completed order from queue
        orderQueue.dequeue();
    }

}
