package coursegradeconcept;

public class CourseGradeConcept {

    
    public static void main(String[] args) {
        
        Course cs38 = new Course( "CS38 Java Programming", 'A' );
        Course cs36 = new Course( "CS36 C Programming", 'B' );
        
        System.out.print( cs38.toString() + "\n\n");
        System.out.print( cs36.toString() + "\n\n");
        
        System.out.println( "Are both courses the same? " 
                + cs38.equals( cs36 ) );
        
        System.out.println( "Changing course \"" + cs36.getCourseName() + "\""
                + " to \"" + cs38.getCourseName() + "\""
                + " and changing its letter grade from \"" + cs36.getLetterGrade() + "\""
                + " to \"" + cs38.getLetterGrade() + "\".");
        cs36.setCourseName( cs38.getCourseName() );
        cs36.setLetterGrade( cs38.getLetterGrade() );
        
        System.out.print( "Are both courses the same? " 
                + cs38.equals( cs36 ) + "\n\n");
        
        System.out.print( cs38.toString() + "\n\n");
        System.out.println( cs36.toString() );
        
        System.exit( 0 );
        
    }
    
}
