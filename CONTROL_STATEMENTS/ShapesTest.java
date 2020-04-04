// Obtaining user input and createing a JFrame to display Shapes 

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest{
    public static void main(String[] args) {
        // obtain user's Choice 
        String input = JOptionPane.showInputDialog (
            "Enter 1 to draw a rectangle\n "+"Enter 2 to draw Ovals"
        );
        int choice = Integer.parseInt(input); //convert input to int 

        // cretae the panel with The user's input 
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame(); //create a new JFrame 

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true); 
    }
} //End Class ShapesTest