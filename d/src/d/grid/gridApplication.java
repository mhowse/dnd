/**
 * gridApplication.java
 */

package d.grid;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Object.*;


public class gridApplication extends JFrame  {
    private JFrame frame;
    private Timer timer;
    private final int DELAY = 10;   
    ButtonListener  listener;
    map Map;
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
       
        timer = new Timer(DELAY,listener);
    }
    
    /**
     * Stops or pauses the game when the stop button is clicked. 
     */
    public void stop(){
        
    }
    
    /**
     * Makes components and sticks them in place. 
     * Handles the gui creation basically. 
     */
    private void init(){
        Map = new map();
	frame = new JFrame("gridGame");
        JButton stop = new JButton("Stop");
        JButton start = new JButton("Start");
        listener = new ButtonListener();        
        stop.addActionListener(listener); 
        start.addActionListener(listener);                   
        JPanel ctrlP = new JPanel();//control panel
        ctrlP.setPreferredSize(new Dimension(500, 100));
               ctrlP.add(start);
               ctrlP.add(stop);
               ctrlP.setBackground(Color.red);
               frame.setPreferredSize(new Dimension(500,500));
               frame.setContentPane(ctrlP);
	frame.getContentPane().add(Map);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
		
	}
    private class ButtonListener implements ActionListener{  //inner class for event handling
        /** what to do when a button has been pressed */
        public void actionPerformed(ActionEvent aE) {
            Object source = aE.getSource();
           map.repaint();   
        } //close method
  } //close inner class
  
}
    
                   


