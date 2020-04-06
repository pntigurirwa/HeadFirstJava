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
        case YO_LEVEN: // win with 11 on first roll
            gameStatus = Status.WON;
            break;
        case SNAKE_EYES: // lose with 2 on first roll
        case TREY://lose with 3 on first roll
        case BOX_CARS://lose with 12 on first roll
            gameStatus = Status.LOST;
            break;
        default: //did not win or lose so remember point 
            gameStatus = Status.CONTINUE; //game is not over 
            myPoint = sumOfDice; // remember the point 
            System.out.printf("Point is %d%n", myPoint);
           break;
    }

    //while game is not complete
    while (gameStatus == Status.CONTINUE) // not won or lost 
     {
        sumOfDice = rollDice(); //roll dice again 

        //determine game status
        if(sumOfDice ==  myPoint ) // win by making point 
        gameStatus = status.WON;
        else
            if(sumOfDice == SEVEN)// lose by rolling 7 before point 
                gameStatus = Status.LOST
    }
    // display won or lost message 
    if(gameStatus == Status.WON)
        System.out.println("player Wins");
    else 
        System.out.println("Player Loses");
}
}