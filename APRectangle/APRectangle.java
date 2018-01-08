package lab02ec;

public class APRectangle {
    private APPoint myTopLeft; 
    private double  myWidth, myHeight, myAngle; 

    public APRectangle( APPoint topLeft, double width, double height ) {
        myTopLeft = topLeft;
        myWidth = width;
        myHeight = height;
        myAngle = 0;
    }
    
    public APPoint getTopLeft() {return myTopLeft;}
    public double getWidth() {return myWidth;}
    public double getHeight() {return myHeight;}
    public double getAngle() {return myAngle;}
    
    public void setTopLeft(APPoint topLeft){myTopLeft = topLeft;}
    public void setWidth(double width){myWidth = width;}
    public void setHeight(double height){myHeight = height;}
    public void setAngle(double angle){myAngle = angle;}
    
    public void shrink(double d)
    {
        d *= 0.01;
        myWidth *= d;
        myHeight *= d;
    }     
      
    public APPoint getTopRight()
    {
        double x = myWidth * Math.cos( myAngle );
        double y = myWidth * Math.sin( myAngle );
        
        return new APPoint( myTopLeft.getX() + x,
                            myTopLeft.getY() - y );
    }
    
    public APPoint getBottomLeft()
    {
        APPoint tr = getTopRight();

        double x = myHeight * Math.sin( myAngle ); 
        double y = myHeight * Math.cos( myAngle );
        
        return new APPoint( myTopLeft.getX() + x,
                            myTopLeft.getY() + y);
    }
    
    public APPoint getBottomRight()
    {
        APPoint tr = getTopRight(); 

        double x = myHeight * Math.sin( myAngle ); 
        double y = myHeight * Math.cos( myAngle );

        return new APPoint( tr.getX() + x,  
                            tr.getY() + y ); 
    }
}
