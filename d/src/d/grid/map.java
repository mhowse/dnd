/**
 * 
 */
package d.grid;
import javax.swing.*;
import java.awt.*;


public class map extends JPanel  {
    int width, height; 
    
    
    public map(){
        width =500; 
        height =500; 
         setBackground(Color.gray);
        setPreferredSize(new Dimension(width, height));
       
    }
 
    /** painting the map. */
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
           
    }
    
  
                 
}

    
    
