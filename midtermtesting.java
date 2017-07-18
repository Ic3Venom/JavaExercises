/* Random testings before the midterm
   *Not an actual exercise*
*/

package midtermtesting;

public class midtermtesting {
    static int h = 10, i = 10;
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;
        System.out.println(!(a&&b));
                
        String c = "awesome";
        String d = "bwesome";
        System.out.println(c.compareTo(d));
        
        int e = 0;
        int f = 1;
        System.out.print("test3: ");
        if(e>0)
        {
            System.out.println(e);
        }
        else
        {
            System.out.println(f);
        }
        System.out.println("h " + h);
        {
            
            h = 10;
            i++;
            
        }
        System.out.println(i);
      
        if true
            if true
                if true
                    if true
                        System.out.print("compiler no likey, but it should work?");
        
        int g = 1;
        System.out.println();
        while true
        {
            System.out.println("test4");
            if (g > 10)
            {
                break;
            }
            
            g++;
        }   
        
        int j = 0x10;
        System.out.println(j);
        
        final float piF = 3.141592653589793f;
        final double piD = 3.141592653589793d;
        
        System.out.println(piF == piD);
                
    }
    
}
