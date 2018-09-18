/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  HighArray.java
 * Purpose    :  Demonstrates array class with high-level interface
 * @author    :  Andrew Narag
 * Date       :  2018-09-17
 * Description:  Adding getMax() and noDups() methods for assignment #1 CMSI_281 using source code from
 *               Lafore book.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-09-17  Andrew Narag  Initial release. Homework assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class HighArray {
    private long[] a;
    private int nElems;

    public HighArray( int max ) {
        a = new long[ max ];
        nElems = 0;
    } //end constructor

    public boolean find( long searchKey ) {
        int j;
        for( j=0 ; j<nElems ; j++ ) {
            if( a[j] == searchKey ) {
                break;
            }
        }
        if( j == nElems ){
            return false;
        } else {
            return true;
        }
    } //end find()

    public void insert( long value ) {
        a[nElems] = value;
        nElems++;
    } //end insert()

    public boolean delete( long value ) {
        int j;
        for( j=0 ; j<nElems ; j++ ) {
            if( value == a[j] ) {
                break;
            }
        }
        if( j == nElems ) {
            return false;
        } else {
            for( int k=j ; k<nElems ; k++ ) {
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    } //end delete()

    public void display() {
        for( int j=0 ; j<nElems ; j++ ) {
            System.out.print( a[j] + " " );
        }
    } //end display()

    public long getMax() {
        long max = 0;
        if( nElems == 0 ) {
            return -1;
        } else {
           for( int j=0 ; j<nElems ; j++ ) {
                if( max < a[j] ) {
                    max = a[j];
                }
            } 
        }
        return max;
    } //end getMax()

    public void noDups() {
        long[] noDupRA = new long[nElems];
        int dupElems = 0;

        if( nElems == 0 ) {
            System.out.println( "Your array is empty." );
        } else {
            noDupRA[0] = a[0];
            dupElems = 1;

            for( int j=1 ; j<nElems ; j++ ) {
                for( int k=0 ; k<dupElems ; k++ ) {
                    if( a[j] == noDupRA[k] ) {
                        System.out.println( "Duplicate found at a["+j+"]: " + a[j] );
                        delete( a[j] );
                        k--;
                    }
                }
                noDupRA[dupElems] = a[j];
                dupElems++;
            }

        }
    } //end noDups()


} //end class HighArray.java
