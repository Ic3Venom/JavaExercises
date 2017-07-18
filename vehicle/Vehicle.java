/*  Extra Credit Project 4
    Created by Julian Meyn
 */

package vehicle;

abstract class Vehicle {

    private String ownerName;
    private int totalWheels;
    
    public Vehicle( String ownerName, int totalWheels )
    {
        
        setOwnerName( ownerName );
        setTotalWheels( totalWheels );
        
    }
    
    public String getOwnerName( )
    {
        
        return ownerName;
        
    }
    
    public int getTotalWheels( )
    {
        
        return totalWheels;
        
    }
    
    public void setOwnerName( String ownerName )
    {
        
        /*normally would have named the parameter 'newName', but I wanted to 
            try the 'this.' syntax
        */
        this.ownerName = ownerName;
        
    }
    
    public void setTotalWheels( int totalWheels )
    {
        
        //Would have named parameter 'newTotalWheels'
        this.totalWheels = totalWheels;
        
    }
    
}
