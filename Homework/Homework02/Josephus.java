/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  Josephus.java
 * Purpose    :  Linked List implementation
 * @author    :  Andrew Narag and Trevor Wong
 * Date       :  2018-10-20
 * Description:  This is an implementation of a circular linked list data structure in Java utilizing a
 *               singly linked circular list.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date               Modified by:        Reason for change or modification
 *  -----  ----------  ----------------------------  -----------------------------------------------------
 *  1.0.0  2018-09-20  Andrew Narag and Trevor Wong  Initial release. In-class assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Scanner;

public class Josephus {

    private static CircularList jList;

    public static void main( String[] args ) {

        jList = new CircularList();
        Scanner myInput = new Scanner( System.in );
        System.out.println( "\n\n   WELCOME TO THE JOSEPHUS PROBLEM!! \n" );
        System.out.println( " How many people are in the circle?" );
        int numP = Integer.parseInt( myInput.nextLine() );
        System.out.println( " By what number are you counting by?" );
        int count = Integer.parseInt( myInput.nextLine() );
        System.out.println( " What number person do you want to start counting from?" );
        int start = Integer.parseInt( myInput.nextLine() );
        
        System.out.println( "\n   Validating input arguments...\n" );
        if( numP < 2 ) {
            System.out.println( "You're not even working with a group. Try adding more people." );
            System.exit( 1 );
        } else if( count>numP ) {
            System.out.println( "I hope you realize you're counting more than the number of people. But we'll allow it." );
        } else if( start<1 || start>numP ) {
            System.out.println( "Stop trying to break the code and pick someone to start from!" );
            System.exit( 1 );
        }
        System.out.println( "All clear." );
        System.out.println( "numP is: "+numP+"  count is: "+count+ "  start is: "+start+"\n" );

        System.out.println( "   Initializing CircularList...\n" );
        for( int i=0 ; i<numP ; i++ ) {
            jList.insert( i+1 );
        }
        jList.step();
        jList.displayList();
        System.out.println();

        System.out.println( "   Setting start point...\n" );
        for( int i=0 ; i<start-1; i++ ) {
            jList.step();
        }
        jList.displayList();
        System.out.println();

        System.out.println( "   Beginning elimination algorithm...\n" );
        while( numP>1 ) {
            for( int i=0 ; i<count ; i++ ) {
                jList.step();
            }
            System.out.println( "See 'ya number "+jList.deleteCurrent() );
            numP--;
        }
        System.out.println( "Person number "+jList.getData()+"is the last standing." );
    }

}
