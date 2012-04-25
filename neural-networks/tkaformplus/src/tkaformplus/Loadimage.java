package tkaformplus;

import java.awt.*;  
import java.awt.event.*;  
import java.awt.image.*;  
import java.io.*;  
import javax.imageio.*;  
import javax.swing.*;  
  
/** 
 * This class demonstrates how to load an Image from an external file 
 */  
public class Loadimage extends Component {  
            
    BufferedImage img;  
  
    @Override
    public void paint(Graphics g) {  
        g.drawImage(img, 0, 0, null);  
    }  

    public Loadimage() {  
       try {  
           img = ImageIO.read(new File("chart.jpg"));  
       } catch (IOException e) {  
       }  
  
    }  
  
    @Override
    public Dimension getPreferredSize() {  
        if (img == null) {  
             return new Dimension(100, 100);  
        } else {  
           return new Dimension(img.getWidth(null), img.getHeight(null));  
       }  
    }  
  
    public static void main(String[] args) {  
  
        JFrame f = new JFrame("Load Image Sample");  
              
        f.addWindowListener(new WindowAdapter(){  
            @Override
                public void windowClosing(WindowEvent e) {  
                    System.exit(0);  
                }  
            });  

        f.add(new Loadimage());
        f.pack();
        f.setVisible(true);
    }  
}  