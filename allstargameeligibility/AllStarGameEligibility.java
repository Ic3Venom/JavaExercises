/* Created by Julian Meyn
    Extra Credit Project 2
 */
package allstargameeligibility;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AllStarGameEligibility {

    public static void main(String[] args) {
        
        int numberOfHits, numberOfBats;
        double hittingPercentage;
        //Instantiating objects
        Scanner scan = new Scanner( System.in );
        DecimalFormat pattern = new DecimalFormat( "0.000" );
        
        
        System.out.print( "How many hits has the player made? ");
        numberOfHits = scan.nextInt();
        
        System.out.print( "How many times has the player been on-base? ");
        numberOfBats = scan.nextInt();
        
        
        hittingPercentage = (double)numberOfHits / (double)numberOfBats;
        
        //Instructions say "greater than 0.300", thus >= is not used
        if ( hittingPercentage > 0.300 )
        {
            System.out.println( "The player is eligible for the All Star Game, having a " 
                    + pattern.format(hittingPercentage) + " hitting percentage!");
        }
        else
        {
            System.out.println( "The player is uneligible for the All Star Game, having a " 
                    + pattern.format(hittingPercentage) + " hitting percentage.");
        }
        
        System.exit( 0 );
        
    }
    
}
