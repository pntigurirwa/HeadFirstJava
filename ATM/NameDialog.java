// obtaining user input from a dialog 

import javax.swing.JOptionPane;

public class NameDialog{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your Name!");

        //Create the message
        String message = String.format("Welcome, %s, to JAva Programming!", name);

        //Display the message to welcome the user by name 
        JOptionPane.showMessageDialog(null, message);
    }//end main

}// end class 
