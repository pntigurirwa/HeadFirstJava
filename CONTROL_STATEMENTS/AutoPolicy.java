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

    //sets the state
    public void setState(String state)
    {
        this.state =state;
    }

    //returns the state
    public String getState()
    {
        return state;
    }

    // predicate method returns whether the state has no fault insurance 
    public boolean isNoFaultState()
    {
        boolean noFaultState;

        // determine whwether state has no fault auto insurance 
        switch (getState()) // get AutoPolicy object's state abbreviation 
         {
            case "MA": case "NJ": case "NY": case "PA": 
                noFaultState =true; 
                
                break;
        
            default:
                noFaultState =false; 
                break;
        }
        return noFaultState; 
    }
} // end class AutoPolicy