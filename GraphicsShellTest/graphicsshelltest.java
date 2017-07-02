
package graphicsshelltest;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class GraphicsShellTest extends JFrame{
     
    
    public void paint( Graphics app ) {
        super.paint( app );
        
        for(int i = 0; i < 255; i++){
            Color c = new Color(i, i, i);
            
            app.setColor( c );
            
            app.drawLine(100, i, 120, i);
            
        }
        
        app.setColor( Color.RED );
        app.fillRect( 100, 70, 50, 50 );

        app.setColor( Color.BLUE );
        app.fillRect( 200, 150, 75, 75 ); 
        
    }
    
    public static void main(String[] args) {
        final GraphicsShellTest app = new GraphicsShellTest( );
        final int HEIGHT = 1000;
        final int WIDTH  = 1000;
        
        app.setSize( HEIGHT, WIDTH );
        
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible( true );
    
    }
    
}
