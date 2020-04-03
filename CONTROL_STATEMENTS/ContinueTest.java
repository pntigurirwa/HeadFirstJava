// break statement exiting a for statement
public class ContinueTest
{
    public static void main(String[] args) {
        int count ; // control variable also used after loop terminates 
        for (count = 1; count <= 10; count ++){
            if(count == 5)
            continue; //skip remaining code in loop if count is 5

            System.out.printf("%d", count);
        }
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}//end class Breaktest