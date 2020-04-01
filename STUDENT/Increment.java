// Prefic increment and postfix increment

public class Increment{
    public static void main(String[] args) {
        // demonstrate postfix increment operator
        int c = 5 ;
        System.out.printf("c before postincrement : %d%n", c); //print 5
        System.out.printf(" postincrementing c : %d%n", c++); //print 5
        System.out.printf("c after postincrement : %d%n", c); //print 6
        
        //demonstrate prefix increment operator
        c=5;
        System.out.printf("c before preincrement : %d%n", c); //print 5
        System.out.printf("   preincrement : %d%n", ++c); //print 6
        System.out.printf("c after preincrement : %d%n", c); //print 6
    }
}// end class Increment 