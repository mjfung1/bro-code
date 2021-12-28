import java.awt.Color;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        

        // JFrame = a GUI window to add components to 

        // ONE WAY TO DO IT.

        // JFrame frame = new JFrame(); // creates a frame
        // frame.setTitle("Ethan and Sophie's playground"); // sets title of frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of app. hide is default
        // frame.setResizable(false); // prevent frame from being resized

        // frame.setSize(420,420); // sets the x and y dimension
        // frame.setVisible(true); // make frame visible

        // frame.getContentPane().setBackground(new Color(123,12,49));


        // ANOTHER WAY TO DO IT. CREATING A SUBCLASS
        MyFrame frame = new MyFrame();


    }
}
