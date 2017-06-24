//Second program in Java
//Julian Meyn

package coins;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coins {

    public static void main(String[] args) {

        //Defining our desired coin types
        int nickelAmount, dimeAmount, quarterAmount;
        
        //Initializing a new Scanner obeject
        Scanner scan = new Scanner( System.in );
        
        //Asking the user for their coins
        System.out.print( "How many nickels do you have? " );
        nickelAmount = scan.nextInt();
        
        System.out.print( "How many dimes do you have? " );
        dimeAmount = scan.nextInt();
        
        System.out.print( "How many quarters do you have? " );
        quarterAmount = scan.nextInt();
        
        //Initializing and setting total money
        double totalAmount = 
                (nickelAmount * 0.05) 
                + (dimeAmount * 0.1)
                + (quarterAmount * 0.25);
        DecimalFormat pricePattern = new DecimalFormat ( "$0.00" );
        
        System.out.println( "Your coins total " 
                + pricePattern.format( totalAmount ) );
        
        System.exit( 0 );
        
   }
    
}
