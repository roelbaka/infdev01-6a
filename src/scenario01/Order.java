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

/**
 *
 * @author Johnson
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
