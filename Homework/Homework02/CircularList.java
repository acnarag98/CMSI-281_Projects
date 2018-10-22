/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  CircularList.java
 * Purpose    :  Singly Linked Circular List Practice
 * @author    :  Andrew Narag and Trevor Wong
 * Date       :  2018-10-15
 * Description:  This is an implementation of a linked list in Java using methods such as insertAt() and
 *               removeAt() allowing for linked list manipulation. Modified to implement a circular list.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date               Modified by:        Reason for change or modification
 *  -----  ----------  ----------------------------  -----------------------------------------------------
 *  1.0.0  2018-09-20            Andrew Narag        Initial release. In-class assignment.
 *  1.0.1  2018-09-26            Andrew Narag        Revision for IntQueue. Changed RemoveAt() method
 *  2.0.0  2018-10-15  Andrew Narag and Trevor Wong  Revision for Circular List implementation.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class CircularList {

   private Node current;
   private Node placeHolder;
   private int  size;

     // the constructor
   CircularList() {
      current = null;
      size = 0;
      }

   public int getSize() {
      return size;
   }

   public int getData() {
      return current.data;
   }

      private class Node {

         int data;
         Node next;

         // constructor
         Node( int d ) {
            data = d;
            next = null;
         }
      }

   public void insert( int data ) {
      if( size == 0 ) {
         System.out.println( "You have no elements in your list yet. Inserting "+data+" as your first element." );
         current = new Node( data );
         size++;
      } else { // a single item list will always have itself as its next Node.
         System.out.println( "Inserting value "+data+" after your current Node. Your current Node will change to the inserted Node." );
         Node toInsert = new Node( data );
         toInsert.next = current.next;
         current.next = toInsert;  
         size++;
         step();
      }
   }

   public int deleteCurrent() {
      int deleted = current.data;
      if( size == 0 ) {
         throw new NullPointerException( "You have no elements to delete!" );
      } else if( size == 1 ) {
         System.out.println( "Great.. You deleted your only element." );
         current = null;
         size--;
      } else {
         System.out.println( "Deleting your current Node, "+current.data+". Your current Node will shift to the next Node, "+current.next.data );
         current = current.next;
         Node newplaceHolder = current;
         for( int i=0 ; i<size-2 ; i++ ) {
            current = current.next;
         }
         current.next = newplaceHolder;
         current = newplaceHolder; //the value after the one deleted is the new current
         size--;
      }
      return deleted;
   }

   public boolean search( int dataToSearch ) {
      Node reset = current;
      if( current.data == dataToSearch ) {
         System.out.println( "Value "+dataToSearch+" is your current value." );
         return true;
      }
      for( int i=0 ; i<size ; i++ ) {
         if( current.next.data == dataToSearch ) {
            System.out.println( "Value "+dataToSearch+" was found "+(i+1)+" Nodes after your current Node" );
            current = reset;
            return true;
         }
         current = current.next;
      }
      System.out.println( "Value "+dataToSearch+" was not found in the list." );
      return false;
   }

   public void step() {
      placeHolder = current;
      for( int i=0 ; i<size-1 ; i++ ) {
         current = current.next;
      }
      current.next = placeHolder;
      current = placeHolder.next;
   }

   public void displayList() {
      if( size == 0 ) {
         System.out.println( "You don't have any elements in your list yet." );
      } else {
         System.out.println( "Current Node: "+getData() );
         for( int i=0 ; i<size-1 ; i++ ) {
            step();
            System.out.println( "next: "+getData() );
         }
         step();
      }
   }

}
