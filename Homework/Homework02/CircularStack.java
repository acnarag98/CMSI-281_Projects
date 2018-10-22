/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  CircularStack.java
 * Purpose    :  Circular Stack implementation
 * @author    :  Andrew Narag and Trevor Wong
 * Date       :  2018-10-15
 * Description:  This is an implementation of a stack data structure in Java utilizing a singly linked
 *               circular list.
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

public class CircularStack {
    
    private static CircularList myStack;

    CircularStack() {
        System.out.println( "\n\n   INITIALIZING CIRCULAR STACK INSTANTIATION...Boop boop beep...\n" );
        System.out.println( "   Defining the current node as the top of the stack\n"+
                            "   and its next as the bottom of the stack.\n" );
        myStack = new CircularList();
    }

    public void push( int data ) {
        myStack.insert( data );
    }  

    public int pop() { //defining the current node as the head of the stack and its next the bottom of the stack.
        int popped = myStack.deleteCurrent();
        return popped;
    }

    public void peek() {
        myStack.displayList();
    }

    public static void main( String[] args ) {

        CircularStack tStack = new CircularStack();
        myStack.displayList();
        tStack.push( 1 );
        myStack.displayList();
        tStack.push( 2 );
        myStack.displayList();
        tStack.push( 3 );
        myStack.displayList();
        tStack.push( 4 );
        myStack.displayList();
        tStack.push( 5 );
        myStack.displayList();
        tStack.push( 6 );
        myStack.displayList();
        tStack.peek();

    }

}
