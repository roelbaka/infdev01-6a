/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario02;

import java.util.*; 

/**
 *
 * @author roel
 */
public class BinarySearch {
    
    Client client;
    Comparator lastNameComparator;
    ArrayList<Integer> resultList;
    int result;
    int i =0;
    
    public ArrayList<Integer> search(ArrayList<Client> searchList, Client client, Comparator lastNameComparator) {
        this.client = client;
        this.lastNameComparator = lastNameComparator;
        resultList = new ArrayList<>();
        
        result = find(searchList);
        resultList.add(result);
        searchList.remove(result);

        //keep searching till result is no longer a positive number
        while(result > 0) {
            i++;
            result = this.find(searchList);
            if(result > 0){
                searchList.remove(result);
                resultList.add(result+i);
            }
        }
        
        return resultList;
    }
    
    public int find(ArrayList<Client> searchList) {
        return Collections.binarySearch(searchList, this.client, this.lastNameComparator);
    }
    
    
      
}
