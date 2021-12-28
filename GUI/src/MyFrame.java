import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    
    MyFrame() {
        this.setTitle("Ethan and Sophie's playground"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of app. hide is default
        this.setResizable(false); // prevent frame from being resized

        this.setSize(420,420); // sets the x and y dimension
        this.setVisible(true); // make frame visible

        this.getContentPane().setBackground(new Color(123,12,49));

    }
}
