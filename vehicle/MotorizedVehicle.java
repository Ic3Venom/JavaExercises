
package vehicle;

public class MotorizedVehicle extends Vehicle {
    
    private double litersDisplaced; //the volume the engine displaces, in liters
    
    public MotorizedVehicle( String ownerName, int totalWheels, double litersDisplaced )
    {
        
        super( ownerName, totalWheels );
        
        setLitersDisplaced( litersDisplaced );
        
    }
   
    public double getLitersDisplaced( )
    {
        
        return litersDisplaced;
        
    }
    
    public void setLitersDisplaced( double litersDisplaced )
    {
        
        //once again trying to practice using the 'this.' syntax
        this.litersDisplaced = litersDisplaced;
        
    }
 
    public double getHorsePower()
    {
        
        return getTotalWheels() * getLitersDisplaced();
        
    }
    
}
