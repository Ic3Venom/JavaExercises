
package restaurantclient;

import java.text.NumberFormat;

public class Restaurant extends Store{
    
    private int peopleServed;
    private double averagePrice;
    
    public Restaurant( String newStoreName, int newPeopleServed, double newAveragePrice ) {
        
        super( newStoreName );
        setPeopleServed( newPeopleServed );
        setAveragePrice( newAveragePrice );
        
    }
    
    public int getPeopleServed( ) {
        
        return this.peopleServed;
        
    }
    
    public void setPeopleServed( int newPeopleServed ) {
        
        this.peopleServed = newPeopleServed;
       
    }
    
    public double getAveragePrice( ) {
        
        return this.averagePrice;
        
    }
    
    public void setAveragePrice( double newAveragePrice) {
        
        this.averagePrice = newAveragePrice;
        
    }
    
    @Override
    public String toString( ) {
        
        NumberFormat pricePattern = NumberFormat.getCurrencyInstance();
        
        return "Name: " + getName()
            + "\nPeople served annualy: " + getPeopleServed() //peopleServed
            + "\nAverage meal price: " + pricePattern.format( this.averagePrice )
            + "\n";
      
    }
    
    public boolean equals( Restaurant otherRestaurant ) {
        
        //Could also call both object's 'toString' methods and comparing those
        return ( getName().equals( otherRestaurant.getName()) )
            && ( this.getPeopleServed() == otherRestaurant.getPeopleServed()) 
            && ( this.getAveragePrice() == otherRestaurant.getAveragePrice());
        
    }
    
    public double averageTaxes( ) {
        
        return getPeopleServed() * getAveragePrice() * getTaxRate();
                
    }
    
}
