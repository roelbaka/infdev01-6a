/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario01;

/**
 *
 * @author Roel
 */
public class OrderManager {
    
    public OrderManager(OrderQueue orderQueue) {
        Order order = (Order)orderQueue.peek();
     
        // Set order status to processing
        order.setProcessing();
        
        System.out.println("Order: " + order.getOrderID() + ", from client: " + order.getClientID() + " is processing");
        
        // Zet de staat van de bestelling op “Compleet” als de huidige tijdstempel hoger dan de som van “start tijd” en “duur” is
        order.setComplete();
        
        System.out.println("Order is complete, duration: " + order.getDuration());
        
        // Remove completed order from queue
        orderQueue.dequeue();
    }

}
