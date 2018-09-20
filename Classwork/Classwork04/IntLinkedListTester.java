/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntLinkedTester.java
 * Purpose    :  Linked List Practice Tester
 * @author    :  Andrew Narag
 * Date       :  2018-09-20
 * Description:  This java class tests several methods of the IntLinkedList.java file.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-09-20  Andrew Narag  Initial release. In-class assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntLinkedListTester {

    public static void main( String[] args ) {
        IntLinkedList myList = new IntLinkedList();
        myList.prepend( 23 );
        myList.prepend( 19 );
        myList.prepend( 17 );
        myList.prepend( 13 );
        myList.prepend( 11 );
        myList.prepend(  7 );
        myList.prepend(  5 );
        myList.prepend(  3 );
        myList.prepend(  2 );
        myList.insertAt( 2, 50 );
        IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
        for( int i=0 ; i<myList.getSize() ; i++ ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
            myIt.next();
        }
        System.out.println( "" );

        myList.insertAt( 3, 51 );
        myIt = myList.getIteratorAt( 0 );
        for( int i=0 ; i<myList.getSize() ; i++ ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
            myIt.next();
        }
        System.out.println( "" );

        myList.insertAt( 0, 1 );
        myIt = myList.getIteratorAt( 0 );
        for( int i=0 ; i<myList.getSize() ; i++ ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
            myIt.next();
        }
        System.out.println( "" );

        myList.insertAt( 1, 100 );
        myIt = myList.getIteratorAt( 0 );
        for( int i=0 ; i<myList.getSize() ; i++ ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
            myIt.next();
        }
        System.out.println( "" );
        
        myList.removeAt( 0 );
        myIt = myList.getIteratorAt( 0 );
        for( int i=0 ; i<myList.getSize() ; i++ ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
            myIt.next();
        }
        System.out.println( "" );

        myList.removeAt( 1 );
        myIt = myList.getIteratorAt( 0 );
        for( int i=0 ; i<myList.getSize() ; i++ ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
            myIt.next();
        }
        System.out.println( "" );

        myList.removeAt( 7 );
        myIt = myList.getIteratorAt( 0 );
        for( int i=0 ; i<myList.getSize() ; i++ ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
            myIt.next();
        }
        System.out.println( "" );

        myList.insertAt( 42, 233 ); //Breaking Code

    }

}
