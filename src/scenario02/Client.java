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
