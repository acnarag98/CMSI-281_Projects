/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntListInterface.java
 * Purpose    :  List Array Manipulation Interface
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

public interface IntListInterface {
    void checkIndex( int index );
    int getListLength();
    int getSize();
    void expandList();
    int getValueAtIndex( int index );
    boolean append( int valueToAdd );
    int removeValueAtIndex( int index );
    void holeFiller( int index );
    boolean insertValueAtIndex( int value, int index );
    void prepend( int valueToAdd );
}
