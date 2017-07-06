
package coursegradeconcept;

public class Course {
    private String courseName;
    private char letterGrade;
    
    
    public Course( String newCourseName, char newLetterGrade )
    {
        
        setCourseName( newCourseName );
        setLetterGrade( newLetterGrade );
        
    }
    
    public void setCourseName( String newCourseName )
    {
        
        courseName = newCourseName;
        
    }
    
    public String getCourseName( )
    {
        
        return courseName;
        
    }
    
    public void setLetterGrade( char newLetterGrade )
    {
        
        letterGrade = newLetterGrade;
        
    }
   
    public char getLetterGrade( ) 
    {
        
        return letterGrade;
        
    }
    
    public String toString( ) 
    {
        return "Course Name: " + getCourseName() 
                + "\nLetter Grade: " + getLetterGrade();
    }
    
    public boolean equals( Course otherCourse )
    {
        return ( this.getCourseName() == otherCourse.getCourseName() ) 
                && ( this.getLetterGrade() == otherCourse.getLetterGrade() );
        
        
    }

}
