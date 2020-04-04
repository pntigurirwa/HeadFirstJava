//drawing a cascade of shapes based on the user's choice 

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
    private int choice; // user's choice of which shape to draw

    //Constructor sets the user's choice 
    public  Shapes(int userChoice)
    {
        choice = userChoice;
    }

    //draw a cascade of shapes starting from the top left corner 
    public void paintComponent(Graphics g)
    {
        super.paintComponet(g);
            for (int i= 0; i<10; i++) {
                //Pick the shape based on the user's choice 
                switch (choice) {
                    case 1: //draw rectangles
                        g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                        
                        break;
                    case 2: //draw ovals
                        g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                        break;
                }
                
            }
    }
}//end class Shapes