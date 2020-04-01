// Solving the class average problem using sentinel controller repetition

import java.util.Scanner; // program uses class Scanner

public class ClassAverage1{
    public static void main(String[] args) {
        // create scanner to obtain input from the command window
    Scanner input = new Scanner(System.in);

    //initialization phase
    int total = 0; // initialize sum of grades entered by the user 
    int gradeCounter = 1; // initialize # of grade to be entered nexy 

    //processing phase uses counter controlled repetition 
    //Prompt for input and read grade from user 
    System.out.print("enter grade or -1 to quit: ");
    int grade = input.nextInt();

    //Loop until sewntinel value read from user
    while(grade != -1)  
    {
        total =total + grade; //add grade to total
        gradeCounter = gradeCounter + 1; //Increment counter by 1

        //prompt for input and next grade from user
        System.out.print("Enter grade or -1 to quit");
        grade = input.nextInt();
    }

    // Termination phase 
    //if a user entered at least one grade 
    if(gradeCounter != 0){
        //use number with decimal point to calculate average of grades
        double average =(double) total / gradeCounter;

        //display total and average 
        System.out.printf("%n Total of the %d grades is %d%n",gradeCounter, total);
        System.out.printf("class average is %2f%n", average);
    } 
    else//no grade were entered, so output appropriate message
       System.out.printf("No grades were entered");
    }
}// end of classAverage 