//Counter controlled repetition with the while repetition statement

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1; //declare and initialize control variable 
        while (counter <= 10){
            //loop continuation condidtion
            System.out.printf("%d ", counter);
            ++counter; //increment control variable
        }
        System.out.println();
    }
}// end class While counter 