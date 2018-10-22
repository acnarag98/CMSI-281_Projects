/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntLinkedList.java
 * Purpose    :  Program that tests Queue.java
 * @author    :  Andrew Narag and Trevor Wong
 * Date       :  2018-10-18
 * Description:  This program uses methods in Queue.java
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-10-18  Andrew Narag and Trevor Wong  Initial release. Homework assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);          // queue holds 5 items
        theQueue.insert(10);                    // insert 4 items
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.display();
        theQueue.remove();                      // remove 3 items
        theQueue.remove();                      // (10, 20, 30)
        theQueue.remove();
        theQueue.insert(50);                    // insert 4 more items
        theQueue.insert(60);                    // (wraps around)
        theQueue.insert(70);
        theQueue.insert(80);
        theQueue.display();
        while( !theQueue.isEmpty() ) {          // remove and display all items
            long n = theQueue.remove();         // (40, 50, 60, 70, 80)
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
