/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  SourceFile.java
 * Purpose    :  File made to read text documents into a string buffer.
 * @author    :  Andrew Narag
 * Date       :  2018-09-05
 * Description:  File will utilize FileReader java classes for reading docs into a String
 *               which will be read and replicated as a new, exact copy.
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
import java.io.FileReader;
import java.io.IOException;

public class SourceFile {

    private FileReader file;
    String fileString = "";

    public SourceFile( String filename ) throws java.io.IOException {

        try {
            file = new FileReader( filename );
            int empty;
            while( ( empty = file.read() ) != -1 ){
                fileString = fileString + ( ( char ) empty );
            }
            file.close();
        }
        catch( IOException e ) {
            System.out.println( "ERROR: Looks like something went wrong with your filename (may not exist), or your file was unreadable! Try a text document!" );
            System.exit( 0 );
        }
        
    }

    public String getFileString() {
        return fileString;
    }

}
