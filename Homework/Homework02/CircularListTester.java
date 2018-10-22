/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  CircularListTester.java
 * Purpose    :  Singly Linked Circular List Practice Tester
 * @author    :  Andrew Narag and Trevor Wong
 * Date       :  2018-10-16
 * Description:  This java class tests methods of the CircularList.java file.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date             Modified by:           Reason for change or modification
 *  -----  ----------  ----------------------------  -----------------------------------------------------
 *  1.0.0  2018-10-16  Andrew Narag and Trevor Wong  Initial release. Homework assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class CircularListTester {

    public static void main( String[] args ) {
        CircularList clist1 = new CircularList();

        System.out.println( "\n\n    INITIALIZING CIRCULAR LIST TESTER...Beep Boop Boop...\n" );

        System.out.println( "  Testing insert() method...\n" );
        clist1.insert(1);
        clist1.displayList();
        clist1.insert(2);
        clist1.displayList();
        clist1.insert(3);
        clist1.displayList();
        clist1.insert(4);
        clist1.displayList();
        clist1.insert(5);
        clist1.displayList();
        clist1.insert(6);
        clist1.displayList();
        clist1.insert(7);
        clist1.displayList();

        System.out.println( "\n  Testing step() method...\n" );
        clist1.step();
        System.out.println( "Expected New Current Node: "+clist1.getData() );
        clist1.displayList();
        clist1.step();
        System.out.println( "Expected New Current Node: "+clist1.getData() );
        clist1.displayList();
        clist1.step();
        System.out.println( "Expected New Current Node: "+clist1.getData() );
        clist1.displayList();

        System.out.println( "\n  Testing deleteCurrent() method...\n" );
        clist1.deleteCurrent();
        clist1.displayList();
        clist1.deleteCurrent();
        clist1.displayList();
        clist1.deleteCurrent();
        clist1.displayList();
        clist1.deleteCurrent();
        clist1.displayList();
        clist1.deleteCurrent();
        clist1.displayList();
        clist1.deleteCurrent();
        clist1.displayList();

        System.out.println("\nStepping Twice..." );
        clist1.step();
        clist1.step();
        clist1.insert(3);
        clist1.insert(4);
        clist1.insert(5);
        clist1.insert(6);
        clist1.insert(7);
        clist1.insert(1);

        System.out.println( "\n  Testing search() method...\n" );
        System.out.println( "Current List:\n" );
        clist1.displayList();
        System.out.println( "\nSearching for value 6...\nExpecting: found" );
        clist1.search(6);
        System.out.println( "\nSearching for value 1...\nExpecting: found" );
        clist1.search(1);
        System.out.println( "\nSearching for value 3...\nExpecting: found" );
        clist1.search(3);
        System.out.println( "\nSearching for value 9...\nExpecting: not found" );
        clist1.search(9);
        System.out.println( "\nSearching for value 1000...\nExpecting: not found" );
        clist1.search(1000);
        System.out.println( "\nSearching for value 259...\nExpecting: not found" );
        clist1.search(259);
    }
}
