/*textPanel.java
 * MHowse sept 2015
 */

package d;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import  java.util.ArrayList.indexOf();

public class textPanel extends JPanel {
  
  private JButton option1 = new JButton ("Option 1");
  private JButton option2 = new JButton ("Option 2");
  private JButton back = new JButton ("Back");
  private JTextField pagefield = new JTextField("##"); 
  private int [] history = new int [10];
  protected int pageNumber;
  private Timer timer;
  private final int DELAY = 10;        
  JButton []  buttonArray = {new JButton("back"), new JButton("Option 1"),new JButton("Option 2")};
  
  /** make and add the graphical components,  constructor of the text pane;*/ 
  public  textPanel(){  
    JPanel controlPanel = new JPanel();
    DrawingPanel drawPanel = new DrawingPanel (); 
    ButtonListener  listener = new ButtonListener();   
    
    // button Array for each loop adding listener  to each button, and each button to control panel
    for ( JButton element : buttonArray ) {       
      element.addActionListener (listener);
      controlPanel.add(element);
    }  //close button loop
    timer = new Timer (DELAY, listener);  //timer section
    controlPanel.setPreferredSize(new Dimension(100,400));
    controlPanel.add(pagefield);
    add(controlPanel);
    add(drawPanel);
  }  
  /** main method*/
  
  public static void main(String[]args){
    JFrame textFrame = new JFrame();
    textFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    textFrame.getContentPane().add(new textPanel());
    textFrame.pack();
    textFrame.setVisible(true);
    textFrame.setTitle("Interactive fiction text game");
   D.page1();
  } //end main 
     
  /** place where the circles are seen to be drawn*/
  private class DrawingPanel extends JPanel {  //inner class for graphics area
    DrawingPanel(){
      setPreferredSize(new Dimension (400,400));
      setBackground(Color.white);
    }
    
    /** drawing all shapes in array*/
    public void paintComponent(Graphics g){
      super.paintComponent(g);
    }    
  }//close drawing class 
  
  
  /** setting up interaction*/
  private class ButtonListener implements ActionListener{  //inner class for event handling
    /** what to do when a button has been pressed */
    public void actionPerformed(ActionEvent aE) {
      Object source = aE.getSource();
      
      if (source == back){  
        try {
          //work out which page you are on, look at history array, go to page -1; 
        }
        catch (NumberFormatException e){
          pagefield.setText(" ");
        }
        catch (IndexOutOfBoundsException e){
          pagefield.setText("");
        }
      } 
      
      // will move the images at each update of  timer, timer updates in delay sized amounts
      if (source == timer){ 
      } else {
        
        JButton button = (JButton) aE.getSource();
        if (button.getText()== "Option 1"){  
          timer.stop();
        }else {
          if (button.getText()== "Option 2") { 
            timer.start();
          }
        }
      }
      repaint();   //As time passes things change. 
   
      
    } // method
  }//inner class
  } //close class