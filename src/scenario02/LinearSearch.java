/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario02;

import java.util.ArrayList;

/**
 *
 * @author roel
 */
public class LinearSearch {

    public Client linearSearch(ArrayList<Client> clientList, String lastName) {
        for (Client client : clientList) {
            if (client.getLastName().equalsIgnoreCase(lastName)) {
                return client;
            }
        }
        return null;
    }

    public Client linearSearch(ArrayList<Client> clientList, int age) {
        for (Client client : clientList) {
            if (client.getAge() == age) {
                return client;
            }
        }
        return null;
    }
}
