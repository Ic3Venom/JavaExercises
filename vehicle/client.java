/* Extra credit project 5
    Created by Julian Meyn
*/

package vehicle;

public class client {
    
    public static void main( String[] args )
    {
        
        MotorizedVehicle lambo = new MotorizedVehicle( "Gus", 4, 5.2 );
        
        System.out.println( "Data about MotorizedVehicle 'lambo': "
                + "\nOwner's name: " + lambo.getOwnerName()
                + "\nAmount of wheels on 'lambo': " + lambo.getTotalWheels()
                + "\nVolume of engine displacement: " + lambo.getLitersDisplaced() + " liters"
                + "\nVehicle's horsepower: " + lambo.getHorsePower() );
        
        System.out.println( "\nChanging some data about 'lambo': "
                + "\nThe owner of 'lambo' will now be 'Phil'"
                + "\nThe amount of wheels on 'lambo will be 6"
                + "\nThe volume of engine displacement will be 6.0 liters");
        lambo.setOwnerName( "Phil" );
        lambo.setTotalWheels( 6 );
        lambo.setLitersDisplaced( 6.0 );
        
        System.out.println( "\nNEW Data about MotorizedVehicle 'lambo': "
                + "\nNEW owner's name: " + lambo.getOwnerName()
                + "\nNEW amount of wheels on 'lambo': " + lambo.getTotalWheels()
                + "\nNEW volume of engine displacement: " + lambo.getLitersDisplaced() + " liters"
                + "\nNEW vehicle's horsepower: " + lambo.getHorsePower() );
        
        System.exit( 0 );
        
    }
    
}
