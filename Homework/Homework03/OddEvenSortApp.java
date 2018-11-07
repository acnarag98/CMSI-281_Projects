/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  OddEvenSortApp.java
 * Purpose    :  Program to test OddEvenSort.java
 * @author    :  Trevor Wong and Andrew Narag
 * Date       :  2018-11-06
 * Description:  This program creates an array which has values inserted to test the OddEvenSort.java
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:                     Reason for change or modification
 *  -----  ----------  ----------------------------  ---------------------------------------------------
 *  1.0.0  2018-11-06  Trevor Wong and Andrew Narag  Initial release. Homework assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class OddEvenSortApp {
    public static void main(String[] args) {
        int maxSize = 100; // array size
        OddEvenSort arr; // reference to array
        arr = new OddEvenSort(maxSize); // create the array
        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display(); // display items
        arr.oddEvenSort(); // sort them
        arr.display(); // display them again
        arr.insert(7231);
        arr.insert(92);
        arr.insert(4312);
        arr.insert(52);
        arr.insert(12);
        arr.insert(32);
        arr.insert(78);
        arr.insert(456);
        arr.insert(6546);
        arr.insert(3456);
        arr.display();
        arr.oddEvenSort();
        arr.display();
        arr.insert(-567);
        arr.insert(-678);
        arr.insert(-86);
        arr.insert(-16);
        arr.insert(-909);
        arr.display();
        arr.oddEvenSort();
        arr.display();
    } // end main()
} // end class BubbleSortApp
