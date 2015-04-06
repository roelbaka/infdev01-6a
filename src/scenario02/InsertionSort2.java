/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scenario02;

import java.util.ArrayList;
import java.util.Comparator;


/**
 *
 * @author roel
 */

   public class InsertionSort2 {
       int size;
      public <T> void sort(ArrayList<T> clientList, Comparator c) {

        size = clientList.size()-1;
         
            T itemToInsert = clientList.get(size);
            int j = size;
            while (j != 0  &&  greaterThan(c, clientList.get(j-1), itemToInsert)) {
               clientList.set(j,clientList.get(j - 1));
               j--;
            }
            clientList.set(j, itemToInsert);
         }
      

      private boolean greaterThan(Comparator comp, Object x, Object y) { 
         return comp.compare(x,y) > 0;
      }
 } 