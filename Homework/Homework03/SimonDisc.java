/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  SimonDisc.java
 * Purpose    :  Simon Disc game simulator
 * @author    :  Andrew Narag
 * Date       :  2018-09-20
 * Description:  This java class simulates the Simon Disc game by comparing user input string arrays and
 *               stored input arrays of "color" sequences. Tested several times with user input. Test code
 *               unavailable as it relies on user input.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-11-18  Andrew Narag  Initial release. In-class assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Scanner;

public class SimonDisc {


    private static String[] colors;
    private String[] colSeq;
    private static final long timeWait = 1000;
    private int elements;


    SimonDisc() throws InterruptedException {

        colors = new String[4]; //initializing colors
        colors[0] = "R"; //red
        colors[1] = "G"; //green
        colors[2] = "Y"; //yellow
        colors[3] = "B"; //blue

        Scanner myInput = new Scanner( System.in ); //initial display and pre-sequence display
        System.out.println( " Select difficulty mode. Enter 1, 2, or 3, 1 being the easiest mode. " );
        int difficulty = Integer.parseInt( myInput.nextLine() );
        elements = difficulty*difficulty*10;
        if( difficulty == 1 ) {
            System.out.println( "Pft. I can do this one with my eyes closed." );
            colSeq = new String[ 10 ];
        }else if( difficulty == 2 ) {
            System.out.println( "Yeahhhhhh! Now we're talkin'." );
            colSeq = new String[ 40 ];
        }else if( difficulty == 3 ) {
            System.out.println( "Have you even thought this through?" );
            colSeq = new String[ 90 ];
        }else {
            System.out.println( "Don't understand that difficulty level. Try 1, 2, or 3." );
        }
        
        try {
            Thread.sleep( timeWait );
        } catch( InterruptedException e ) {}
        System.out.println( "Ready?");
        try {
            Thread.sleep( timeWait );
        } catch( InterruptedException e ) {}
        System.out.print( "3... ");
        try {
            Thread.sleep( timeWait );
        } catch( InterruptedException e ) {}
        System.out.print( "2... ");
        try {
            Thread.sleep( timeWait );
        } catch( InterruptedException e ) {}
        System.out.println( "1...");
        try {
            Thread.sleep( timeWait );
        } catch( InterruptedException e ) {}
        System.out.println( "Here it comes!");
        try {
            Thread.sleep( timeWait );
        } catch( InterruptedException e ) {} 


        for( int i=0 ; i<elements ; i++ ) { //sequence displaying
            int randomNum = (int)( Math.random()*4 );
            colSeq[i] = colors[randomNum];
            System.out.print( colSeq[i] );
            try {
                Thread.sleep( timeWait );
            } catch( InterruptedException e ) {}
            System.out.print( "\b \b" );
            try {
                Thread.sleep( 200 );
            } catch( InterruptedException e ) {}

        }
        System.out.println( "How many can you get of the "+elements+"?\nDon't separate your guesses with any character\n(i.e. RBYGRR...)" );
        String[] guess = myInput.nextLine().split( "", elements );
        for( int i=0 ; i<elements ; i++ ) { //validating guess sequence and uppercasing all guess letters
            if( guess[i] == null ) { 
                System.out.println( "You don't have enough elements.\nYou needed "+elements+".\nYou had "+(i) );
                System.exit( 1 );
            }
            guess[i] = guess[i].toUpperCase();
            if( guess[i].equals( "R" ) == false && guess[i].equals( "Y" ) == false && guess[i].equals( "G" ) == false && guess[i].equals( "B" ) == false ) {
                System.out.println( "You didn't enter R Y G or B for element number "+(i+1)+"." );
                if( i== elements-1 ) {
                    System.out.println( "Or you have too many guesses. You should have "+elements );
                }
                System.out.println( "Try again!" );
                System.exit( 1 );
            }

        }

        for( int i=0 ; i<elements ; i++ ) { //start checking if correct
            System.out.println( "guess[i] is: "+guess[i]+"\ncolSeq[i] is: "+colSeq[i] );
            if( guess[i].equals( colSeq[i] ) == false ) { //mismatch found
                System.out.println( "Ouch! You messed up "+(i+1)+" elements in! Try again!" );
                for( int k=0 ; k<elements ; k++ ) {
                    if( k==0 ) {
                        System.out.println( "The correct sequence was: ");
                    }
                    System.out.print( colSeq[k] );
                }
                for( int j=0 ; j<elements ; j++ ) {
                    if( j==0 ) {
                        System.out.println( "\nYour sequence was: ");
                    }
                    System.out.print( guess[j] );
                }
                System.exit( 1 );
            }
        }
        System.out.println( "Nice job! You got them all!" ); //mismatch not found

    }//end SimonDisc() constructor

    public static void main( String[] args ) {
        try {
            SimonDisc game1 =  new SimonDisc();
        } catch( InterruptedException e ) {}
    }

}
