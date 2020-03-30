// Acount class that contains a name nstance variable
// and a methods to set and get its value

public class Account {
    private String name; // instance variable
    private double balance; //instance variable

    // Account constructor that receives two parameters
    public Account (String name, double balance)
    {
        this.name = name; //Assign name to instance variable name 
        
        //validate that the balance is gretaer tahn 0.0; if it's not, 
        //instance variable balance keeps ists default initial value of 0.0
        if(balance  > 0.0) //if balance is valid
        this.balance = balance; // assign it to instance variable balance 
    }
    
    //method that deposits(adds) only a valid amount to the balance 
    public void deposit(double depositAmount){
        if (depositAmount > 0.0) // if depositAmount is valid
            balance =balance + depositAmount; //Add it to the balance 
    }

    // Method returns the account balance 
    public double getBalance(){
        return balance;
    }
    
    //Method to set name in the object
    public void setName(String name){
        this.name = name; //store the name 
    }

    //Method to retrieve the name from the object
    public String getName(){
        return name;// return value of name to caller 
    }
}// end of class Account 