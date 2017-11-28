import javax.swing.*;
import java.awt.*;

public class Assignment14 {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setVisible(true);
        
        JButton button = new JButton("D. Ceglia");
        button.setBounds(100,50,200,40);
        button.setVisible(true);
        
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
