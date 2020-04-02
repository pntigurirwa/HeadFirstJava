//Compound Interest calculation with for 

public class Interest{
    public static void main(String[] args) {
        double amount ; // amount on deposit at end of ecah year
        double rate = 0.05; // interest rate
        double principal = 1000.0; //Initial amount before interest

        //Display headers
        System.out.printf("%s%20s%n", "year", "amount on deposit");

        for(int year = 1; year <= 10; ++year){
        //calculate amount deposit for each ten years
        amount = principal * Math.pow(1.0 + rate, year );

        //Display the year and the amount
        System.out.printf("%4d%,20.2f%n", year, amount); 
        }
    }
}