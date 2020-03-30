// Creatinf and manipulating an account object
//Using thre Account constructor to initialize the name instance
//variable at the time each Account object is created

public class AccountTest{
    public static void main(String[] args) {
        //Creaete two Accounts objects
        Account account1 = new Account ("Jane Green");
        Account account2 = new Account ("Jane Blue");

        // display initial value of name for each  Account 
        System.out.printf("Account1 name is : %s%n", account1.getName());
        System.out.printf("Account2 name is : %s%n", account2.getName());
    }
}// end of class AccountTEst