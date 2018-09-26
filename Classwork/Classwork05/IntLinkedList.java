/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntLinkedList.java
 * Purpose    :  Linked List Practice
 * @author    :  Andrew Narag
 * Date       :  2018-09-20
 * Description:  This is an implementation of a linked list in Java using methods such as insertAt() and
 *               removeAt() allowing for linked list manipulation.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-09-20  Andrew Narag  Initial release. In-class assignment.
 *  1.0.1  2018-09-26  Andrew Narag  Revision for IntQueue. Changed RemoveAt() to return removed data.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntLinkedList {

   private Node head;
   private int  size;

     // the constructor
   IntLinkedList() {
      head = null;
      size = 0;
      }

   public int getSize() {
      return size;
   }

   public void prepend( int dataToAdd ) {
      Node currentHead = head;
      head = new Node( dataToAdd );
      head.next = currentHead;
      size++;
   }

      private class Node {

         int data;            // remember this is an IntLinkedList
         Node next;           // here's the self-referential part

         // constructor
         Node( int d ) {
            data = d;
            next = null;
         }
      }

   public Iterator getIteratorAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = new Iterator();
      while( index > 0 ) {
         it.next();
         index--;
      }
      return it;
   }

   public void insertAt( int index, int data ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException( "Your index is too big or < 0!" );
      }
      System.out.println( "Inserting value, "+data+", at index "+index );
      Node toInsert = new Node( data );
      Iterator it = new Iterator();
      if ( index == 0 ) {
         head = toInsert;
         toInsert.next = it.currentNode;
         size++;
         return;
      }
      for( int i=1 ; i<index ; i++ ) {
         it.next();
      }
      toInsert.next = it.currentNode.next;
      it.currentNode.next = toInsert;
      size++;
   }

   public int removeAt( int index ) {
      int removed;
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException( "Your index is too big or < 0!" );
      }
      //System.out.println( "Removing value at index "+index );
      Iterator it = new Iterator();
      if( index == 0 ) {
         head = it.currentNode.next;
         removed = it.currentNode.data;
         return removed;
      }
      for ( int i=1 ; i<index ; i++ ){
         it.next();
      }
      removed = it.currentNode.next.data;
      it.currentNode.next = it.currentNode.next.next;
      size--;
      return removed;
   }

      public class Iterator {
         private Node currentNode;

         Iterator() {
            currentNode = head;
         }

         public void next() {
            if( currentNode == null ) {
               return;
            } else {
               currentNode = currentNode.next;
            }
         }

         public boolean hasNext() {
            return ((currentNode != null) && (currentNode.next != null));
         }

         public int getCurrentInt() {
            return currentNode.data;
         }



      }

        
}
            
