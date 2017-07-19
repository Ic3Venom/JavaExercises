/* Extra Credit Project 5
    Created by Julian Meyn
*/

package carplate;

public class client {
    
    public static void main( String[] args )
    {
        
        CarPlate car1 = new CarPlate("1234567", "California", "white");
        System.out.println(car1.toString());
        
        CarPlate car2 = new CarPlate("SEVEN77", "Rhode Island", "GreEN");
        System.out.println(car2.toString());
        
        CarPlate car3 = new CarPlate("A113PIX", "Kansas", "PINK");
        System.out.println(car3.toString());
        
        
    }
    
}
