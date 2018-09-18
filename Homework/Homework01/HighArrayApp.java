/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  HighArrayApp.java
 * Purpose    :  Demonstrates array class with high-level interface
 * @author    :  Andrew Narag
 * Date       :  2018-09-17
 * Description:  Main application utiilzing constructor and methods in HighArray.java
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-09-17  Andrew Narag  Initial release. Homework assignment #1.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 
 class HighArrayApp {

    public static void main( String[] args ){
        System.out.println( "\n\n  Initializing HighArrayApp.java..." );
        System.out.println( "Assume positive values for HighArray.java.\n" );

        int maxSize = 100; 
        HighArray arr = new HighArray( maxSize );
        System.out.println( "Array 'a' initialized with "+maxSize+" null values.\n");
        arr.insert( 77 );
        arr.insert( 99 );
        arr.insert( 44 );
        arr.insert( 55 );
        arr.insert( 22 );
        arr.insert( 88 );
        arr.insert( 11 );
        arr.insert( 00 );
        arr.insert( 66 );
        arr.insert( 33 );

        arr.display();

        int searchKey = 35;
        if( arr.find( searchKey ) ) {
            System.out.println( "Found " + searchKey );
        } else {
            System.out.println( "Can't find " + searchKey );
        }

        arr.delete( 00 );
        System.out.println( "\nafter deleting 00:\n" );
        arr.display();

        
        arr.delete( 55 );
        System.out.println( "\nafter deleting 55:\n" );
        arr.display();

        arr.delete( 99 );
        System.out.println( "\nafter deleting 99:\n" );
        arr.display();

        System.out.println( "\n\n  Testing getMax() Method...\n" );
        System.out.println( "Should get: 88\ngot: " + arr.getMax() );
        arr.insert( 100 );
        System.out.println( "Should get: 100\ngot: " + arr.getMax() );
        arr.delete( 100 );
        arr.delete( 99 );
        arr.delete( 88 );
        arr.insert( 23 );
        System.out.println( "Should get: 77\ngot: " + arr.getMax() );
        arr.delete( 77 ); //deletes value 77 at index 0, not 77 at index 6. Interesting..
        arr.insert( 300 );
        arr.insert( 140 );
        arr.insert( 124 );
        arr.insert( 425 );
        System.out.println( "Should get: 425\ngot: " + arr.getMax() );
        arr.delete( 425 );
        arr.delete( 124 );
        arr.insert( 5555 );
        arr.insert( 1 );
        arr.insert( 3233 );
        System.out.println( "Should get: 5555\ngot: " + arr.getMax() );

        HighArray arr1 = new HighArray( maxSize );
        System.out.println( "\n\n  Testing noDups() Method...\n" );
        arr1.insert( 22 );
        arr1.insert( 66 );
        arr1.insert( 15 );
        arr1.insert( 22 );

        System.out.print( "Current array: " );
        arr1.display();
        System.out.println("");
        arr1.noDups();
        System.out.print( "   Should get: 66 15 22\n" +
                          "          got: " );
        arr1.display();
        System.out.println("\n");

        arr1.insert( 400 );
        arr1.insert( 142 );
        arr1.insert( 15 );
        arr1.insert( 223 );

        System.out.print( "Current array: " );
        arr1.display();
        System.out.println("");
        arr1.noDups();
        System.out.print( "   Should get: 66 22 400 142 15 223\n" +
                          "          got: " );
        arr1.display();
        System.out.println("\n");
        
        arr1.insert( 22 );
        arr1.insert( 22 );
        arr1.insert( 22 );

        System.out.print( "Current array: " );
        arr1.display();
        System.out.println("");
        arr1.noDups();
        System.out.print( "   Should get: 66 400 142 15 223 22\n" +
                          "          got: " );
        arr1.display();
        System.out.println("\n");
    }

 }
