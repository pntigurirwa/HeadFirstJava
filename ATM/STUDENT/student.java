//Student class that stores a student name and average 

public class student{
    private String name;
    private double average;

    // Constructor to initialize instance variable
    public student(String name, double average)
    {
        this.name= name;

        //validate that average is > 0.0 and <= 100.0; otherwise 
        //keep instance variable average'default value(0.0)
        if (average > 0.0) 
            if(average <= 100.0)
                this.average = average; // assign to instance variable  
    }

    // Set Student's name 
    public void setName (String name)
    {
        this.name= name;
    }

    // Get Student's name 
    public void getName ()
    {
       return name;
    }

    // sets student's average 
    public void setAverage(double studentAverage)
    {
        //validate that average is > 0.0 and <= 100.0; otherwise 
        //keep instance variable average'default value(0.0)
        if (average > 0.0) 
            if(average <= 100.0)
                this.average = average; // assign to instance variable  
    }

    //etrieve student's average 
    public void setAverage ()
    {
        return average;
    }

    // determine and return the Student's letter grade
    public String getLetterGrade()
    {
        String letterGrade = "";// initialized to empty String
        if (average >= 90)
            letterGrade = "A";
            else if (average >=80.0) 
                 letterGrade = "B";   
                 else if (average >=70.0)  
                     letterGrade = "C";
                        else if (average >=60.0) 
                            letterGrade = "D";
                                else 
                                    letterGrade = "F";

                                    return letterGrade;

    }
}