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
 * @author Roel
 */
public class Client {

    private int ID;
    private String lastName;
    private String suffix;
    private String firstName;
    private int age;
    private char gender;
    private String city;
    private String emailAddress;

    /**
     * Client Constructor
     *
     * @param ID
     * @param lastName
     * @param suffix
     * @param firstName
     * @param age
     * @param gender
     * @param city
     * @param emailAddress
     */
    public Client(String lastName, String suffix, String firstName, int age, char gender, String city, String emailAddress) {
        this.ID = this.hashCode();
        this.lastName = lastName;
        this.suffix = suffix;   
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.emailAddress = emailAddress;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
     @Override
    public String toString() {
          return  "Client:" + this.getID() + ", " + this.getLastName() + ", " + this.getSuffix() + ", " + this.getFirstName() + ", " + this.getAge() + ", " +
                  this.getGender() + ", " + this.getCity() + ", " + this.getEmailAddress();
                  
    }
    
}
