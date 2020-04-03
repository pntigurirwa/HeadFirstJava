//Demonstarate String in Switch 
public class AutoPolicyTest
{
    public static void main(String[] args) {
        // create two Autopolicy objects
        AutoPolicy policy1 = new AutoPolicy (11111111, "Toyota Camry", "NJ"); 
        AutoPolicy policy2 = new AutoPolicy (22222222, "Ford Fusion", "ME");

        // display whether  each policy is in a no fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    //method that display whether an Autopolicy 
    // is in a state with no fault auto insurance 
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy: ");
        System.out.printf("Account#: %d; Car: %s; State %s %s a no-fault stae%n%n", 
        policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), 
        policy.getState(), 
        (policy.isNoFaultState() ? "is": "is not"));
    }

}// end class AutoPolicy