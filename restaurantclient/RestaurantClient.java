/*Fourth Java program
  Created by Julian Meyn
*/

package restaurantclient;

import java.text.NumberFormat;

public class RestaurantClient {

    public static void main(String[] args) {
        
        //Instantiating the new instances of Restaurant
        Restaurant r1 = new Restaurant("California Pizza Kitchen", 200000, 30),
                   r2 = new Restaurant("The Stand", 250000, 34.99);
        
        //getting a NumberFormat object
        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
        
        
        System.out.println( r1.toString() );
        System.out.println( r2.toString() );
        
        
        //Setting r2.peopleServed to r1.peopleServed
        System.out.println( "Changing r2's number of people served to " 
            + r1.getPeopleServed() );
        r2.setPeopleServed( r1.getPeopleServed() );
        
        //Setting r2.averagePrice to r1.averagePrice
        System.out.println( "Changing r2's average meal price to " 
            + priceFormat.format( r1.getAveragePrice() ) + "\n" );
        r2.setAveragePrice( r1.getAveragePrice() );
        
        
        //Comparing r1 and r2
        System.out.println( "Are restaurant 1(r1) and restaurant 2(r2) the same? "
            + r1.equals( r2 ) + "\n" );
        
        //Setting r2.name to r1.name
        System.out.println( "Changing r2's store name to \""
            + r1.getName() + "\"\n" );
        r2.setName( r1.getName() );
        
        //Comparing r1 and r2
        System.out.println( "Are restaurant 1(r1) and restaurant 2(r2) the same? "
            + r1.equals( r2 ) + "\n" );        
        
        
        //Decided not to use DecimalFormat for this, price is already double
        System.out.println("Average price per person: "
            + priceFormat.format( r1.getAveragePrice() ) );
        
        System.exit( 0 );
        
    }
    
}
