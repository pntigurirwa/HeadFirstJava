// Creating JFrame to display DrawPanel

public class DrawPanelTest{
    public static void main(String[] args) {
        
        //crete a panel that contains our drawing 
        DrawPanel panel = new DrawPanel();

        //create a new frame to hold the panel 
        JFrame application = new JFrame();

        //Set  the frame to exit when it is closed 
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}