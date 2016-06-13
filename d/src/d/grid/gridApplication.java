/**
 * gridApplication.java
 */

package d.grid;

import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class gridApplication extends JFrame{
    private JFrame frame;
    private Timer timer;
    private JButton stop;
    private JButton start;
    public gridApplication(){
        init();
        generate();
    }
    
    /**
     * generates food and or other conditions at creation of game. 
     */
    public void generate(){
        
    }
    
    /**
     * Starts playing the game. 
     */
    public void start(){
       // timer = new Timer();
    }
    
    /**
     * Makes components and sticks them in place. 
     * Handles the gui creation basically. 
     */
    private void init(){
		map Map = new map();
		frame = new JFrame("gridGame");
                JPanel ctrlP = new JPanel();//control panel
                stop = new javax.swing.JButton();
                start = new javax.swing.JButton();
                stop.setText("Stop");
                start.setText("Start");
                ctrlP.add(start);
                ctrlP.add(stop);
                
          
                  
                frame.getContentPane().add(ctrlP);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(Map);
		frame.pack();
		frame.setVisible(true);
		
	}
    
                   


}
