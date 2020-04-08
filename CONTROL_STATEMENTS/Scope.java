//Scope class demonstrates fiels and local variable scopes.

public class Scope
{
    // field that is accessible to all methods of this class 
    private int x = 1; 

    // method main creates and initialize local variable x 
    // and calls methods useLocalVariable and useField
    public static void main(String[] args) {
        int x = 5; // method's local variable x shadows fields x 
        System.out.printf("local x in main is %d%n", x);

        useLocalVariable(); // useLocalVariable has local x
        useField(); // useField uses class class Scope's field x 
        useLocalVariable(); // useLocalVariable reinstatilizes local x
        useField(); // class Scope's field x retains its value 

        System.out.printf("nlocal x in main is %d%n", x);
    }
    //create and initialize local variable x during 
}