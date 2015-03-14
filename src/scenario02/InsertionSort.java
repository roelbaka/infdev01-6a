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

   public class InsertionSort {

      /* pre: the compare() method of c is suitable for comparing any two
      **      elements of a[]
      ** post: the elements of a[] have been rearranged so that they are in
      **       ascending order with respect to the ordering defined by c's
      **       compare() method
      */
      public <T> void sort(ArrayList<T> clientList, Comparator c) {

         for (int i=0;  i != clientList.size();  i = i+1) {
            T itemToInsert = clientList.get(i);
            int j = i;
            while (j != 0  &&  greaterThan(c, clientList.get(j-1), itemToInsert)) {
               clientList.set(j,clientList.get(j - 1));
               j--;
            }
            clientList.set(j, itemToInsert);
         }
      }

      private boolean greaterThan(Comparator comp, Object x, Object y) { 
         return comp.compare(x,y) > 0;
      }
 } 