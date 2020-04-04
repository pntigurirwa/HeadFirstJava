//Logical Operators 

public class LogicalOperators
{
    public static void main(String[] args) {
        // Create truth for && conditional oprerator 
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
        "Conditional AND (&&)", "false && false", (false && false), 
        "false && true", (false && true),
        "true && false", (true && false),
        "true && true", (true && true ));
    
        // Create truth for || conditional oprerator 
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
        "Conditional OR (||)", "false || false", (false || false), 
        "false || true", (false || true),
        "true || false", (true || false),
        "true || true", (true || true ));
    
        // Create truth for & (boolean logical AND) oprerator 
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
        "Conditional AND (&)", "false & false", (false & false), 
        "false & true", (false & true),
        "true & false", (true & false),
        "true & true", (true & true ));
    
        // Create truth for | (boolean logical inclusive OR) oprerator 
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
        "Boolean Logical Inclusive OR (|)", "false | false", (false |false), 
        "false | true", (false | true),
        "true | false", (true | false),
        "true | true", (true | true ));
    
        // Create truth for ^ (boolean logical exclusive OR) oprerator 
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", 
        "Boolean Logical exclusive OR (^)", "false ^ false", (false ^ false), 
        "false ^ true", (false ^ true),
        "true ^ false", (true ^ false),
        "true ^ true", (true ^ true ));
    
        //Create truth table for !(logical negation) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)", 
        "!false", (!false), "!true", (!true));
    
    
    
    }
}