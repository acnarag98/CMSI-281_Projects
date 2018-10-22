/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  DequeApp.java
 * Purpose    :  Program that tests Deque.java
 * @author    :  Andrew Narag and Trevor Wong
 * Date       :  2018-10-18
 * Description:  This program uses methods in Deque.java
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

class DequeApp {
    public static void main(String[] args) {
        Deque theDeque = new Deque(5);          // Deque holds 5 items
        theDeque.insertLeft(10);                    // insertLeft 4 items
        theDeque.insertLeft(20);
        theDeque.insertLeft(30);
        theDeque.insertLeft(40);
        theDeque.display();
        theDeque.removeRight();                      // removeRight 3 items
        theDeque.removeRight();
        theDeque.removeRight();
        theDeque.insertLeft(50);                    // insertLeft 4 more items
        theDeque.insertLeft(60);
        theDeque.insertLeft(70);
        theDeque.insertLeft(80);
        theDeque.display();
        theDeque.removeLeft();                      // removeLeft 4 items
        theDeque.removeLeft();
        theDeque.removeLeft();
        theDeque.removeLeft();
        theDeque.insertRight(21);                    // insertRight 4 more items
        theDeque.insertRight(34);
        theDeque.insertRight(56);
        theDeque.insertRight(90);
        theDeque.display();
        theDeque.removeRight();
        theDeque.insertRight(5);
        theDeque.display();
        theDeque.removeLeft();
        theDeque.insertLeft(1);
        theDeque.display();
        theDeque.insertLeft(2);
        theDeque.insertLeft(3);
        theDeque.insertLeft(4);
        theDeque.display();
    }
}
