// Creatinf and manipulating an account object

import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args) {
        // cretae a scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //create and account object and assign it to myAccount
        Account myAccount = new Account();

        //display initial value of name (null)
        System.out.printf("initial name is %s%n%n", myAccount.getName());

        //prompt for and read name 
        System.out.println("please enter the name: ");
        String theName = input.nextLine(); // read a line of text
        myAccount.setName (theName); // put theName in myAccount
        System.out.println();// output a blank line

        //display the name stored in object myAccount
        System.out.printf("name in object myAccount is : %n%s%n", myAccount.getName());

    }
}// end of class AccountTEst