/**
 * 
 */
package d.grid;
import javax.swing.*;
import java.awt.*;


public class map extends JPanel  {
    int width, height; 
    Color  a,b,c,d,e,f,g;
   
    
    public void setColour(){
        a = Color.decode("#3B3131");
        b = Color.decode("#ffcc99");
    }
    
    public map(){
        setColour();
        width =500; 
        height =500; 
        setBackground(b);
        setPreferredSize(new Dimension(width, height));
        setVisible(true);
        setOpaque(true);
       
    }
 
    /** painting the map. */
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
           
    }
    
  
                 
}

    
    
