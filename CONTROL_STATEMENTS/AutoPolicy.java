// Class that represents an auto insurance policy

public class AutoPolicy{
    private int accountNumber;// policy account number 
    private String makeAndModel;// car that the policy applies to
    private String state; // two letter state abbreviation 

    //Constructor 
    public AutoPolicy (int accountNumber, String makeAndModel, String state)
    {
        this.accountnumber = accountNumber; 
        this.makeAndModel = makeAndModel; 
        this.state = state; 
    }

    //sets the accountNumber 
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountnumber;
    }

    //returns the accountNumber 
    public int getAccountNumber ()
    {
        return accountnumber; 
    }

    // sets the makeAndModel
    public void setMakeAndModel(String makeAndModel)
    {
        this.makeAndModel = makeAndModel;
    }

    //returns he make and model
    public String getMakeAndModel()
    {
        return makeAndModel;
    }
}