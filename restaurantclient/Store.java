
package restaurantclient;

public class Store {
    private String storeName;
    private final double taxRate = 0.06;
    
    public Store( String newStoreName ) {
        
        setName( newStoreName );
        
    }
    
    public String getName( ) {
        
        return this.storeName;
       
    }
    
    public void setName( String newStoreName ) {

        this.storeName = newStoreName;
    
    }
    
    public double getTaxRate( ) {
        
        return this.taxRate;
        
    }
    
    @Override
    public String toString( ) {
        
        return getName();
        
    }
    
    public boolean equals( Store otherStore ) {
        
        return ( this.getName().equals( otherStore.getName() ) );
        
    }

}
