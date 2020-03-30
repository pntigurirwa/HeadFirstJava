// Creatinf and manipulating an account object
//Using thre Account constructor to initialize the name instance
//variable at the time each Account object is created


//Inputing and outputing floating point numbers with Account objects

import java.util.Scanner; 

public class AccountTest{
    public static void main(String[] args) {
        //Creaete two Accounts objects
        Account account1 = new Account ("Jane Green", 50.00);
        Account account2 = new Account ("Jane Blue", -7.53);

        // display initial value of name for each  Account 
        System.out.printf("%s balance: $%.2f%n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        //create a scanner to obtain input from the command window
        Scanner input = new Scanner (System.in);

        System.out.print("Enter Deposit amount for account1: ");// prompt 
        double depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("nadding %.2f to account1 balance%n%n", depositAmount);// add to account1's balance 

        //Display balances 
        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter Deposit amount for account1: ");// prompt 
        depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("nadding %.2f to account2 balance%n%n", depositAmount);// add to account2's balance 

        //Display balances 
        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());



    }
}// end of class AccountTEst