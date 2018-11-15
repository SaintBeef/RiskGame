import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class mainStage extends JPanel {
    static int wi = 480, he = 600;
    public mainStage(int p) {
        wi = getWidth(); 
        he = getHeight();
        setBackground(Color.BLUE);
        init(p);
    }

    public static void init(int p) {
        JFrame frame = new JFrame();
        BufferedImage map = new BufferedImage(he, wi, BufferedImage.TYPE_INT_RGB);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(he, wi);
        frame.setResizable(true);
        frame.setVisible(true);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
    }
}