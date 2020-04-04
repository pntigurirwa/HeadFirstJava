// Obtaining user input and createing a JFrame to display Shapes 

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest{
    public static void main(String[] args) {
        // obtain user's Choice 
        String input = JOptionPane.showInputDialog (
            "Enter 1 to draw a rectangle\n "+"Enter 2 to draw Ovals"
        );
        int choice Integer.parseInt(Input); //convert input to int 

        // cretae the panel with The user's input 
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame(); //create a new JFrame 

        apllication 
    }
}