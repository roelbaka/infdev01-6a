/*
 * OrderQueue using Composition: declare a linked list as a data field in the OrderQueue class 
 */
package scenario01;

import java.util.LinkedList;

/**
 *
 * @author Johnson
 */
public class OrderQueue<E> {
   private LinkedList<E> list = new LinkedList<E>();
   public void enqueue(E item) {
      list.addLast(item);
   }
   public E dequeue() {
      return list.poll();
   }
   public boolean hasItems() {
      return !list.isEmpty();
   }
   public int getSize() {
      return list.size();
   }
   public E peek(){
       return list.getFirst();
   }
   public void addItems(OrderQueue<? extends E> q) {
      while (q.hasItems())
         list.addLast(q.dequeue());
   }
   
}
