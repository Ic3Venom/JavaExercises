
package studentclient;

public class StudentClient {
       
    public static void main(String[] args) {
        
        //Initializing both students
        Student s1 = new Student("Julian", "123456789", 4.00);
        Student s2 = new Student("Charisse", "314159265", 3.76);
        
        //Printing out the information of s1 using the getInfo methods
        System.out.print("Name: " + s1.name + "\n"
                + "Social security number: " + s1.SSN + "\n"
                + "Grade point average: " + s1.GPA  + "\n\n");
        
        //Printing out the information of s2 using the toString() method
        System.out.print( s1.toString() );
        
        //Comparing s1 and s2 to see if they are equal
        System.out.print( "Student 1 and student 2 are the same person: "
                + s1.equals(s2) 
                + "\n");
        
        //Changing the information of s2 to the same information as s1
        s2.setName("Julian");
        s2.setSSN("123456789");
        s2.setGPA(4.00);
        
        //Comparing s1 and s2 again to see if they are equal
        System.out.print( "Student 1 and student 2 are the same person: "
                + s1.equals(s2) 
                + "\n");
        
    }
    
}
