/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario02;

import java.util.Comparator;
/**
 *
 * @author roel
 */
public class ClientAgeComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getAge()-o2.getAge();
    }
}