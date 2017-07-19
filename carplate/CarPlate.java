package carplate;

public class CarPlate {
    private String plateNum;
    private String state;
    private String plateColor; //java.awt.Color can't return a color's English name
    
    public CarPlate( String plateNum, String state, String plateColor )
    {
        
        setPlateNum( plateNum );
        setState( state );
        setPlateColor( plateColor );
        
    }
    
    public void setPlateNum( String plateNum )
    {
        
        this.plateNum = plateNum;
        
    }
    
    public String getPlateNum( )
    {
        
        return plateNum;
        
    }
    
    public void setState( String state )
    {
        
        this.state = state;
        
    }
    
    public String getState( )
    {
        
        return state;
        
    }
    
    public void setPlateColor( String plateColor )
    {
        
        this.plateColor = plateColor;
        
    }
    
    public String getPlateColor( )
    {
        
        return plateColor;
        
    }
    
    @Override
    public String toString( )
    {
        
        return String.format("%7s %-12s %s", 
                getPlateNum(), 
                getState(), //'Rhode Island' is the longest state name (12 chars)
                getPlateColor().toUpperCase() ); //Color could be any str length
    }
    
}
