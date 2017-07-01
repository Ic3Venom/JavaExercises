
package graphicsshelltest;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class GraphicsShellTest extends JFrame{
    private final static GraphicsShellTest app = new GraphicsShellTest( );
    public  final static int HEIGHT = 1000;
    public  final static int WIDTH  = 1000;
    
    public void paint( Graphics app ) {
        super.paint( app );

        app.setColor( Color.RED );
        app.fillRect( 100, 70, 50, 50 );

        app.setColor( Color.BLUE );
        app.fillRect( 200, 150, 75, 75 ); 
    }
    
    public static void main(String[] args) {
        
        app.setSize( HEIGHT, WIDTH );
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible( true );
    
    }
    
}
