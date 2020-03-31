// Solving the class average problem using counter controller repetition

import java.util.Scanner; // program uses class Scanner

public class ClassAverage{
    public static void main(String[] args) {
        // create scanner to obtain input from the command window
    Scanner input = new Scanner(System.in);

    //initialization phase
    int total = 0; // initialize sum of grades entered by the user 
    int gradeCounter = 1; // initialize # of grade to be entered nexy 

    //processing phase uses counter controlled repetition 

    while(gradeCounter <= 10) //loops 10times 
    {
        System.out.print("Enter Grade: "); //prompt
        int grade = input.nextInt(); // input next grade
        total =total + grade; //add grade to total
        gradeCounter = gradeCounter + 1; //Increment counter by 1
    }

    // Termination phase 
    int average = total / 10; // Integer divison yielding integer result

    //display total average of grades
    System.out.printf("%n Total of all 10 grades is %d%n", total);
    System.out.printf("class average is %d%n", average);
    }
}