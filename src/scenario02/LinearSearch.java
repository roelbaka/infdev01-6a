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

    public Client linearSearch(ArrayList<Client> clientList, String wordnum) {
        for (Client client : clientList) {
            if (client.getLastName().equalsIgnoreCase(wordnum)) {
                return client;
            }
        }
        return null;
    }
}
