/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  MyFileCopier.java
 * Purpose    :  File made to make copies of text documents.
 * @author    :  Andrew Narag
 * Date       :  2018-09-05
 * Description:  Main user interaction file made to handle the SourceFile.java and TargetFile.java files.
 *               Also used for experience in implementing packages in Java.
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

import copiersupport.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.IOException;



public class MyFileCopier {

    public static void main( String[] args ) throws java.io.IOException {

        try {
        System.out.println( "What is the name of the file you would like to copy?" );
        Scanner myInput = new Scanner( System.in );
        String inputName = myInput.nextLine();

        SourceFile input = new SourceFile( inputName );
        String toCopy = input.getFileString();

        TargetFile copy = new TargetFile ( toCopy, inputName );
        }
        catch( IOException e ){
            System.out.println("Something's hinky. IOException thrown.");
            System.exit( 0 );
        }


    }

}
