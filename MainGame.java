import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class MainGame extends JPanel {
    static int wi = 480, he = 600;
    public MainGame() {
        wi = getWidth(); 
        he = getHeight();
        setBackground(Color.BLUE);
        init();
    }

    public static void init() {
        JFrame frame = new JFrame();
        BufferedImage map = new BufferedImage(he, wi, BufferedImage.TYPE_INT_RGB);
        File regdata = new File("regdata.txt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(he, wi);
        frame.setResizable(true);
        frame.setVisible(true);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
    }
}