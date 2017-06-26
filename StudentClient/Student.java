package studentclient;

public final class Student {
    
    //SSN and GPA are in capital letters because they are acronyms
    private String name, SSN;
    private double GPA;
    
    public Student( String newName, String newSSN, double newGPA)
    {
        setName( newName );
        setSSN( newSSN );
        setGPA( newGPA );
    }
    
    public String getName( )
    {
        return name;
    }
    
    public void setName( String newName )
    {
        this.name = newName;
    }
    
    public String getSSN( )
    {
        return SSN;
    }
    
    public void setSSN( String newSSN )
    {
        this.SSN = newSSN;
    }
    
    public double getGPA( )
    {
        return GPA;
    }
    
    public void setGPA( double newGPA )
    {
        this.GPA = newGPA;
    }
    
    public String toString( )
    {
       return  "Name: " + this.name + "\n"
                + "Social security number: " + this.SSN + "\n"
                + "Grade point average: " + this.GPA  + "\n\n";
    }
    
    public boolean equals( Student o )
    {
        return o.name.equals(name) && o.GPA == GPA && o.SSN.equals(SSN);
    }

}
