/* Extra Credit Project 5
    Created by Julian Meyn
*/

package carplate;

import java.io.*;

public class client {
    
    public static void main( String[] args ) throws IOException
    {
        
        CarPlate car1 = new CarPlate("1234567", "California", "white");
        CarPlate car3 = new CarPlate("A113PIX", "Kansas", "PINK");
        CarPlate car2 = new CarPlate("7SEVEN7", "Rhode Island", "GreEN");
        
        try
        {
            //"fo" stands for FileOutput, "oo' stands for ObjectOutput
            FileOutputStream foStream = new FileOutputStream(new File("fileOutput.txt"));
            ObjectOutputStream ooStream = new ObjectOutputStream( foStream );

            // Write objects to file
            ooStream.writeObject( car1 );
            ooStream.writeObject( car2 );
            ooStream.writeObject( car3 );

            ooStream.close();
            foStream.close();

            //"fi" stands for FileInput, "oi" stands for ObjectInput
            FileInputStream fiStream = new FileInputStream(new File("fileOutput.txt"));
            ObjectInputStream oiStream = new ObjectInputStream( fiStream );

            while( fiStream.available() > 0 )
            {
                
                CarPlate buffer = (CarPlate) oiStream.readObject();
                System.out.println( buffer.toString() );
            
            }
            
            oiStream.close();
            fiStream.close();

        }
        catch (FileNotFoundException e) 
        {
            
            System.out.println("File not found");
                
        } 
        catch (IOException e) 
        {
            
            System.out.println("Error initializing stream");
        
        } 
        catch (ClassNotFoundException e) {
        
            e.printStackTrace();

        }
        
        
    }
    
}
