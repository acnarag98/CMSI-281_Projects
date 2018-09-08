/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  TargetFile.java
 * Purpose    :  File to make copies of inputted buffered-read files.
 * @author    :  Andrew Narag
 * Date       :  2018-09-05
 * Description:  This program will utilize buffered writer to make a copy of input.txt file.
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-09-05  Andrew Narag  Initial release. In-class assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

package copiersupport;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TargetFile {

    public TargetFile( String toCopy, String fileName) {
        
        try {
            /* FileWriter toWrite = new FileWriter( fileName+ ".copy.txt" );
            BufferedWriter text = new BufferedWriter( toWrite );
            while ( toCopy.readLine() != null ) {
                text.write( toCopy.read() );
                System.out.println( "dafuq" );
                System.out.println("writing into document");
            }
            */
            BufferedWriter text = new BufferedWriter( new FileWriter( fileName + ".copy" ) );
            text.write( toCopy );
            text.close();
        }
        catch( IOException e ){
            System.out.println( "ERROR: Something is hinky. Do you have anything written in this document?" );
            System.exit( 0 );
        }

    }


}
