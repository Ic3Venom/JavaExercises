/*Fourth Java program
  Created by Julian Meyn
*/

package restaurantclient;

public class RestaurantClient {

    public static void main(String[] args) {
        
        Restaurant r1 = new Restaurant("California Pizza Kitchen", 600, 20.00),
                   r2 = new Restaurant("The Stand", 760, 15.00);
        
        System.out.print(r1.toString() + "\n");
        System.out.print(r2.toString() + "\n");
        
        //Setting r2.peopleServed to r1.peopleServed
        System.out.print( "Changing r2's number of people served  to " 
            + r1.getPeopleServed() + "\n" );
        r2.setPeopleServed( r1.getPeopleServed() );
        
        //Setting r2.averagePrice to r1.averagePrice
        System.out.print( "Changing r2's average meal price to " 
            + r1.getAveragePrice() + "\n"
            + "\n" );
        r2.setAveragePrice( r1.getAveragePrice() );
        
        //Comparing r1 and r2
        System.out.print( "Are restaurant 1(r1) and restaurant 2(r2) the same? "
            + r1.equals( r2 ) + "\n" );
        
        //Setting r2.name to r1.name
        System.out.print( "Changing r2's store name to "
            + r1.getName() + "\n"
            + "\n" );
        r2.setName( r1.getName() );
        
        //Comparing r1 and r2
        System.out.print( "Are restaurant 1(r1) and restaurant 2(r2) the same? "
            + r1.equals( r2 ) + "\n" );        
        
        System.out.print(" ");
        
        System.exit( 0 );
        
    }
    
}
