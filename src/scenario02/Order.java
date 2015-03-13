/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario02;

/**
 *
 * @author Roel
 */
public class Order {
    private int orderID;
    private int clientID;
    private boolean processing=false;
    private long startTime;
    private long duration;
    private boolean complete=false;
    private boolean awaitOrder=false;
    private boolean urgent = false;

    public Order(int clientID, boolean urgent){
        this.orderID = this.hashCode();
        this.clientID = clientID;
        this.urgent = urgent;
    }
    
    public void setStartTime(long startTime){
        this.startTime = startTime;
    }

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the clientID
     */
    public int getClientID() {
        return clientID;
    }

    /**
     * @param clientID the clientID to set
     */
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    /**
     * @return the processing
     */
    public boolean isProcessing() {
        return processing;
    }

    /**
     * @param process the processing to set
     */
    public void setProcessing() {
        this.processing = true;
        this.startTime  = System.currentTimeMillis();    

    }

    /**
     * @return the startTime
     */
    public long getStartTime() {
        return startTime;
    }

     /**
     * @void long the duration, currentTime - startime
     */
    public void setDuration() {
        this.duration = System.currentTimeMillis() - this.startTime;
    }
    
    /**
     * @return long the duration
     */
    public long getDuration() {
        return this.duration;
    }

    /**
     * @return the complete
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * @param complete the complete to set
     */
    public void setComplete() {
        this.complete = true;
        this.setDuration();
    }

    /**
     * @return the awaitOrder
     */
    public boolean isAwaitOrder() {
        return awaitOrder;
    }

    /**
     * @param awaitOrder the awaitOrder to set
     */
    public void setAwaitOrder(boolean awaitOrder) {
        this.awaitOrder = awaitOrder;
    }
    
    /**
     * @return true if the order is urgent
     */
    public boolean getUrgent() {
        return this.urgent;
    }
    
    
}