//Letter grades class uses the Switch statement to count letter grades 

import java.util.Scanner;
public class LetterGrades{
    public static void main(String[] args) {
        
        int total = 0;// sum of grades 
        int gradeCounter = 0; // number of grades entered 
        int aCount = 0; //Count of A grades 
        int bCount =0; // comut of B grades
        int cCount = 0; // Count of C count 
        int dCount = 0; //Count of D count 
        int fCount =0; // Count of F Grades 

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n  %s%n  %s%n", "Enter the Integer grades in the range 0-100. ",
             "Type the end of File insicator to terminate input:", 
             "On UNIX/LINUX/ Mac OS X type <ctrl> d then press Enter", 
             "On Windows types <Ctrl> Z then press Enter");

        //Loop until user enters the end of file indicator 
        while (input.hasNext()) {
            int grade = input.nextInt(); // read grade
            total += grade; //add grade to total
            ++gradeCounter; // increment number of grades

                //increment appropriate letter grade counter
                switch (grade / 10) {
                    case 9: //grade was between 90
                    case 10: //and 100
                        ++aCount;
                        break; //exits switch
                    case 8: //grade was between 80 and 89
                        ++bCount;
                            break; //exits switch
                    case 7: //grade was between 70 and 79
                         ++cCount;
                            break; //exits switch
                    case 6: //grade was between 60 and 69
                        ++dCount;
                           break; //exits switch
                        
                        default: //grade was less than 60 
                        ++fCount;
                        break; // optional; exits switch anyway
                    }// end switch
            
        }// end while 

        //display grade report 
        System.out.printf("%n Grade Report: %n");

        //if user entered atleast one grade ......
        if (gradeCounter != 0){
            //calculate average of all grades entered
            double average = (double) total / gradeCounter; 

            //Output summary of results
            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class Average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
            "Number of Students who received each grade:", 
            "A: ", aCount, //display number of A grades
            "B: ", bCount, //display number of B grades
            "C: ", cCount, //display number of C grades
            "D: ", dCount, //display number of D grades
            "F: ", fCount); //display number of F grades
            
        }// end if 
        else// no grades were entered, so output appropriate message
            System.out.println("No grade were entered");
    }// end main
}//end class letterGrade