// Craps class simulates the dice game craps
import java.security.SecureRandom;

public class Craps
{
//Create secure random number for use in method rollDice
private static final SecureRandom randomNumber = new Securerandom();

//Enum type with constants that represent the game ststus
private enum Status {CONTINUE,WON,LOST};

//constants that represent common rolls of the dice 
private static final int SNAKE_EYES =2;
private static final int TREY = 3;
private static final int  SEVEN =7; 
private static final int YO_LEVEN = 11;
private ststic final int BOX_CARS = 12;

//plays one game of craps
public static void main(String[] args) {
    int myPoint = 0; //point if no win or loss on first roll
    Status gameStatus; // can contain CONTINUE, WON, or LOST
    int sumOfDice = rollDice(); //first roll of dice 

    //determine game status and point based on first roll
    switch (sumOfDice) {
        case SEVEN: // win with 7 on first roll
            
            break;
    
        default:
            break;
    }
}
}