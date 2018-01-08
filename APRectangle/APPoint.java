package lab02ec;


public class APPoint
{ 
    private double myX; 
    private double myY; 

    public APPoint( double x, double y ) 
    { 
      myX = x; 
      myY = y; 
    } 

    public double getX() { return myX; } 
    public double getY() { return myY; } 
    public void setX( double x ) { myX = x; } 
    public void setY( double y ) { myY = y; } 
}
