import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class MainGame extends JPanel {
    int wi = 480, he = 600;
    ArrayList<country> cuntreg = new ArrayList();
    
    
    public MainGame() throws FileNotFoundException {
        wi = getWidth(); 
        he = getHeight();
        setBackground(Color.BLUE);
        init();
    }

    public void init() throws FileNotFoundException {
        JFrame frame = new JFrame();
        BufferedImage map = new BufferedImage(he, wi, BufferedImage.TYPE_INT_RGB);
        File regdata = new File("regdata.txt");
        Scanner sb = new Scanner(regdata);
        while(sb.hasNext()) {
            String[] params = sb.nextLine().split(",");
            cuntreg.add(new country(params));
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(he, wi);
        frame.setResizable(true);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}