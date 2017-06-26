
package studentclient;

public class StudentClient {
       
    public static void main(String[] args) {
        
        //Initializing both students
        Student s1 = new Student("Julian", "123456789", 4.00),
                s2 = new Student("Charisse", "314159265", 3.76);
        
        //Printing out the information of s1 using the getInfo methods
        System.out.print("Name: " + s1.getName() + "\n"
                + "Social security number: " + s1.getSSN() + "\n"
                + "Grade point average: " + s1.getGPA()  + "\n\n");
        
        //Printing out the information of s2 using the toString() method
        System.out.print( s2.toString() );
        
        //Comparing s1 and s2 to see if they are equal
        System.out.print( "Student 1 and student 2 are the same person: "
                + s1.equals(s2) 
                + "\n\n");
        
        //Changing the information of s2 to the same information as s1
        System.out.print("Changing student 2's name from \"" + s2.getName()
                + "\" to Julian\"\n"
                + "Changing student 2's GPA from \"" + s2.getGPA()
                + "\" to \"4.00\"\n"
                + "Changing student 2's SSN from \"" + s2.getSSN()
                + "\" to \"123456789\"\n\n");
        s2.setName("Julian");
        s2.setSSN("123456789");
        s2.setGPA(4.00);
        
        //Comparing s1 and s2 again to see if they are equal
        System.out.print( "Student 1 and student 2 are the same person: "
                + s1.equals(s2) 
                + "\n");
        
        System.out.print("\nExiting program...\n");
        System.exit( 0 );
        
    }
    
}
