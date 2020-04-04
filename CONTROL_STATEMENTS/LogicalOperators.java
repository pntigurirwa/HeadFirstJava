//Logical Operators 

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
    "false && true", (false || true),
    "true && false", (true || false),
    "true && true", (true || true ));

    
}