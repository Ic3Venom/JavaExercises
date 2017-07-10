
package addlinenumbers;

import java.util.Scanner;
import java.io.*;

public class AddLineNumbers {

    public static void main( String[] args ) {
        
        FileInputStream inputFile;
        FileOutputStream outputFile;
        int lineNumber;
        
        try 
        {
            
            inputFile = new FileInputStream( "dataInput.txt" );
            outputFile = new FileOutputStream( "dataOutput.txt" );
            
            Scanner scan = new Scanner( inputFile );
            PrintWriter pw = new PrintWriter( outputFile );
                        
            while ( scan.hasNext() )
            {
                
                String line = scan.nextLine();
                
                
            }
            
            
        } 
        catch (FileNotFoundException e)
        {
            System.err.println("Error: " + e.getMessage() + " " + e.toString());
            e.printStackTrace();
        }
        catch ( IOException e )
        {
            System.err.println("Error: " + e.getMessage() + " " + e.toString());
            e.printStackTrace();
        }
        finally
        {
            //TODO: add system.out messages about closing files
            inputFile.close();
            outputFile.close();
            
        }
        
                
        
    }
    
}
