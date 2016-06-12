/**
 * gridApplication.java
 */

package d.grid;

import javax.swing.*;


public class gridApplication extends JFrame{
    private JFrame frame;
    private Timer timer;
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(Map);
		frame.pack();
		frame.setVisible(true);
		
	}
}
