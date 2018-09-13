/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntList.java
 * Purpose    :  List Array Manipulation
 * @author    :  Andrew Narag
 * Date       :  2018-09-13
 * Description:  Implements several methods to insert, append, and prepend int values into a list.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-09-13  Andrew Narag  Initial release. In-class assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntList implements IntListInterface {

    private int[] theList;
    private int size;

    private static final int STARTING_SIZE = 19;

    public IntList() {
        theList = new int[ STARTING_SIZE ];
        size = 0;
    }

    public void checkIndex( int index ) throws ArrayIndexOutOfBoundsException {
        if( size == 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The list is empty!" );
        } else if( index > size ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too large. There's nothing here yet! There's only " + size + " integers in this list." );
        } else if( index > theList.length ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too large. This list can only hold " + theList.length + " integer elements.");
        } else if( index < 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too small. You can't have a negative index!");
        } else if( index == theList.length ) { 
            expandList();
        }
    }

    public int getListLength() {
        return theList.length;
    }

    public int getSize(){
        return size;
    }

    public void expandList() {
        System.out.println(" The current list is too small to complete this operation. *Expanding list by " + STARTING_SIZE + " integer elements.");
        int[] expandedList = new int[ theList.length + STARTING_SIZE ];
        System.arraycopy( theList, 0, expandedList, 0, theList.length);
        theList = expandedList;
    }

    public int getValueAtIndex( int index ) {
        checkIndex( index );
        return theList[index];
    }

    public boolean append( int valueToAdd ) {
        if ( size < theList.length ) {
            theList[size] = valueToAdd;
            size++;
        } else {
            expandList();
        }
        return true;
    }

    public int removeValueAtIndex( int index ) {
        checkIndex( index );
        int value = theList[index];
        holeFiller( index );
        return value;
    }

    public void holeFiller( int index ) {
        for( int i = index; i < size - 1; i++ ) {
            theList[i] = theList[i+1];
        }
        size--;
    }

    public boolean insertValueAtIndex( int value, int index ) {
        checkIndex( size );
        System.out.println("size is: "+size);
        System.out.println("size-index is: "+ (size-index) );
        System.out.println("theList[index] is: "+theList[index]+"\n");
        for( int i = size; i > index; i-- ) {
            System.out.println("i is:"+i+", i-1 is: "+ (i-1) );
            System.out.println("theList[i-1] is: "+theList[i-1]);
            System.out.println("theList[i] is: "+theList[i]);
            theList[i] = theList[i-1];
            System.out.println("theList[i] is now: "+theList[i]);
        }
        theList[index] = value;
        size++;
        return true;
    }

    public void prepend( int valueToAdd ) {
        checkIndex( size );
        for( int i = size; i > 0; i-- ) {
            theList[i] = theList[i-1];
        }
        theList[0] = valueToAdd;
        size++;
    }

    public static void main( String[] args ){
        System.out.println( "Initializing IntList...");
        IntList list = new IntList();
        list.append( 2 ); //index 0
        list.append( 3 ); //index 1
        list.append( 5 ); //index 2
        list.append( 7 ); //index 3; size = 4; insert value @ index 2; decrement > size-index = 2, i>2
        
        list.append( 11 ); //index 4
        list.append( 13 ); //index 5
        list.append( 17 ); //index 6
        list.append( 19 ); //index 7; size = 8;

        System.out.println( "Checking append() Implentation...Beep Boop Boop." );
        for (int i=0 ; i<list.getSize() ; i++) {
            System.out.println( "at index "+i+", "+list.getValueAtIndex( i ) + " ");
        }

        list.insertValueAtIndex(5, 6);

        System.out.println( "Checking insertValueAtIndex() Implementation...Boop Beep Boop." );
        for (int i=0 ; i<list.getSize() ; i++) {
            System.out.println( "Now, at index "+i+", "+list.getValueAtIndex( i ) + " ");
        }
        
        list.prepend( 42 );

        System.out.println( "Checking prepend() Implementation...Beep Boop Boop." );
        for (int i=0 ; i<list.getSize() ; i++) {
            System.out.println( "Now, at index "+i+", "+list.getValueAtIndex( i ) + " ");
        }
    }

}
