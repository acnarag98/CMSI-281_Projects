/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntQueue.java
 * Purpose    :  Queue Implementation
 * @author    :  Andrew Narag
 * Date       :  2018-09-26
 * Description:  Utilizes IntLinkedList.java to create a queue implementation of a linked list. Built off
 *               of IntStack.java. Test in main.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-09-26  Andrew Narag  Initial release. In-class assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntQueue {

      static IntLinkedList myQueue;
      static IntLinkedList.Iterator myIt;

      IntQueue() {
         myQueue = new IntLinkedList();         // constructor
      }

      public void push( int itemToPush ) {
         myQueue.prepend( itemToPush );
      }

      public int peek() {
         return myQueue.getIteratorAt( myQueue.getSize()-1 ).getCurrentInt();     // we use the iterator
      }

      public int firstOut() {
         return myQueue.removeAt( myQueue.getSize()-1 );
      }

      public static void main( String[] args ) {

         IntQueue testQueue = new IntQueue();
         testQueue.push( 19 );
         testQueue.push( 23 );
         testQueue.push( 29 );
         testQueue.push( 31 );
         testQueue.push( 37 );
         testQueue.push( 41 );
         testQueue.push( 43 );
         testQueue.push( 47 );
         testQueue.push( 51 );
         testQueue.push( 57 );

         System.out.println( "\n     Testing firstOut() Method...\n\n" );
         myIt = myQueue.getIteratorAt( 0 );
         for( int i=0 ; i<myQueue.getSize() ; i++ ) {
            System.out.println( "Index "+i+", "+myIt.getCurrentInt() );
            myIt.next();
            
         }
         System.out.println( "The front of the Queue: " + testQueue.peek() );
         System.out.println( "Removing front thing: index " + myQueue.getSize() + ", " + testQueue.firstOut() + "\n" );

         myIt = myQueue.getIteratorAt( 0 );
         for( int i=0 ; i<myQueue.getSize() ; i++ ) {
            System.out.println( "Index "+i+", "+myIt.getCurrentInt() );
            myIt.next();
            
         }
         System.out.println( "The front of the Queue: " + testQueue.peek() );
         System.out.println( "Removing front thing: index " + myQueue.getSize() + ", " + testQueue.firstOut() + "\n" );
         testQueue.push( 100 );
         testQueue.push( 1 );

         myIt = myQueue.getIteratorAt( 0 );
         for( int i=0 ; i<myQueue.getSize() ; i++ ) {
            System.out.println( "Index "+i+", "+myIt.getCurrentInt() );
            myIt.next();
            
         }
         System.out.println( "The front of the Queue: " + testQueue.peek() );
         System.out.println( "Removing front thing: index " + myQueue.getSize() + ", " + testQueue.firstOut() + "\n" );

         myIt = myQueue.getIteratorAt( 0 );
         for( int i=0 ; i<myQueue.getSize() ; i++ ) {
            System.out.println( "Index "+i+", "+myIt.getCurrentInt() );
            myIt.next();
            
         }
         System.out.println( "The front of the Queue: " + testQueue.peek() );
         System.out.println( "Removing front thing: index " + myQueue.getSize() + ", " + testQueue.firstOut() + "\n" );

         
      }

   }
