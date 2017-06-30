
package graphicsshelltest;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class GraphicsShellTest extends JFrame{
    
    public void paint( Graphics g ) {
        super.paint( g );

        g.setColor( Color.RED );
        g.fillRect( 100, 70, 50, 50 );

        g.setColor( Color.BLUE );
        g.fillRect( 200, 150, 75, 75 ); 
    }
    
    public static void main(String[] args) {
        GraphicsShellTest app = new GraphicsShellTest( );
        
        app.setSize( 400, 300 );
        app.setVisible( true );
    }
    
}
