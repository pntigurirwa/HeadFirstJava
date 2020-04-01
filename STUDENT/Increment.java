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

/* Good Prgramming Practice: 
When writting expressions containing many operators confirm that the operators
in the expression are performed in the order you expect. If you are uncertain
about the order of evaluation in a complex expression, braeak the expression into 
smaller statements or use parentheses to force the order of evaluation, exactly 
as you'd do in an algebraic expression. be sure to ibserve that some operators 
such as assignement(=) associate right to left rather than left to right 
*/