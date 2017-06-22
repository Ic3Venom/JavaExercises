//Third Java Program
//Created by Julian Meyn

package studentclient;

public final class Student {
    
    public String name, SSN;
    public double GPA;
    
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
    
    public void setName( String newName)
    {
        name = newName;
    }
    
    public String getSSN( )
    {
        return SSN;
    }
    
    public void setSSN( String newSSN )
    {
        SSN = newSSN;
    }
    
    public double getGPA()
    {
        return GPA;
    }
    
    public void setGPA( double newGPA )
    {
        GPA = newGPA;
    }
    
    public String toString( )
    {
       return  "Name: " + name + "\n"
                + "Social security number: " + SSN + "\n"
                + "Grade point average: " + GPA  + "\n\n";
    }
    
    public boolean equals( Student o )
    {
        if ( o.name.equals(name) && o.GPA == GPA && o.SSN.equals(SSN) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
