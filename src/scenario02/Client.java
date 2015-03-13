/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario02;

/**
 *
 * @author Johnson
 */
public class Client {
    private int clientID;
    private String lastName;
    private String suffix;
    private String firstName;
    private int age;
    private char sex;
    private String city;
    private String emailAddress;
    
    /**
         * @param firstName     String
         * @param suffix        String
         * @param lastName      String
         * @param age           Integer
         * @param sex           Char
         * @param city          String
         * @param emailAddress  String
         */
    public Client(String lastName, String suffix, String firstName, int age, char sex, String city, String emailAddress){
		this.clientID = this.hashCode();
		this.lastName = lastName;
		this.suffix = suffix;
		this.firstName = firstName;
		this.age = age;
		this.sex = sex;
		this.city = city;
                this.emailAddress = emailAddress;
	}
}
