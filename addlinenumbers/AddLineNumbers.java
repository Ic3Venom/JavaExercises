/*Fifth Java Exersice 
  Created by Julian Meyn
*/

package addlinenumbers;

import java.util.Scanner;
import java.io.*;

public class AddLineNumbers {

    public static void main( String[] args ) {
        
        FileReader inputFile;
        FileWriter outputFile;
        int lineNumber = 1; //Using 1 instead of 0 for non-programming readers
        
        try 
        {
            
            /*Oracle's Java API on InputFileReader and OutputFileReader say that: 
                * "FileInputStream is meant for reading streams of raw bytes such as image data. 
                    For reading streams of characters, consider using FileReader."
                * "FileOutputStream is meant for writing streams of raw bytes such as image data. 
                    For writing streams of characters, consider using FileWriter."
                Thus, for this exersice FileReader and FileWriter are used
            */
            inputFile = new FileReader( "dataInput.txt" );
            outputFile = new FileWriter( "dataOutput.txt" );
            
            Scanner scan = new Scanner( inputFile );
            PrintWriter pw = new PrintWriter( outputFile );
                        
            while ( scan.hasNext() )
            {
                
                String fileLine = scan.nextLine();
                
                //println used for the automatic newline added
                //no spacing between lineNumber and line in output file
                pw.println(lineNumber + fileLine);
                
                lineNumber++;
            }
            
            //Files must close correctly before text is printed, else catch is run
            scan.close();
            System.out.println("Input file has been read and closed.");
            pw.close();
            System.out.println("Output file has been written and closed.");
            
        } 
        catch (FileNotFoundException e)
        {
            System.err.println("Error: " + e.getMessage() + " " + e.toString());
            e.printStackTrace();
            System.exit( 1 );
        }
        catch ( IOException e )
        {
            System.err.println("Error: " + e.getMessage() + " " + e.toString());
            e.printStackTrace();
            System.exit( 1 );
        }
        
        System.exit( 0 );
        
    }
    
}
