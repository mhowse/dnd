/*gui.java
 * MHowse/cleddyf october 2015
 * aka I give up on netbeans automatically generated bloat code and do it all by hand.
 */

package d;
/*To do;
 * comment everthing 
 * commit once commented 
 * exception in initializer error  gui line 63/d prolouge
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Start of gui class
 */
public class gui extends JPanel {
 /**
  * Declare and initialize variables, 
  * Buttons, textfields for displaying current page number
  * other relevant things. 
  */
  private JButton back = new JButton ("back");
  private JButton option1 = new JButton ("Option 1");
  private JButton option2 = new JButton ("Option 2");
  private JTextField pageNumber = new JTextField("##");  
  private JLabel pageLabel = new JLabel("Current page");
  //protected int count;
  protected int pageNo;
  private Timer timer;
  protected static String pageText = "start";
  protected static String lineTwo = " ";
  protected static String lineThree = "  ";
  protected static String lineFour = "  ";
  protected static int picture = 0;
  private final int DELAY = 10;         
  JButton []  buttonArray = { back, option1, option2};
  
  
  /** 
   * gui constructor. 
   * makes and add the graphical components
   */ 
  public  gui(){  
    JPanel controlPanel = new JPanel();
    DrawingPanel drawPanel = new DrawingPanel (); //step 4 drawing panel class
    ButtonListener  listener = new ButtonListener();   // listener section 
   
    // button Array for each loop adding listener  to each button, and each button to control panel
    for ( JButton element : buttonArray ) {       
      element.addActionListener (listener);
      controlPanel.add(element);
    }  //close button loop
    
    
    timer = new Timer (DELAY, listener);  //timer section
    controlPanel.add (pageLabel) ;
    controlPanel.add( pageNumber);
    controlPanel.setPreferredSize(new Dimension(100,400));
    
    add(controlPanel);
    add(drawPanel);
  }  
  
  /** main method
   * @param string args 
   */
  public static void main(String[]args) throws IOException{
    JFrame shapeFrame = new JFrame();
    shapeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    shapeFrame.getContentPane().add(new gui());
    shapeFrame.pack();
    shapeFrame.setVisible(true);
    shapeFrame.setTitle("shape panels and random circles");
   /**
   * Images declared and buffered for loading when page turned. 
   */
   final BufferedImage image1 = ImageIO.read(new File("image1.jpg"));
   final BufferedImage image2 = ImageIO.read(new File("image2.jpg"));
   final BufferedImage image3 = ImageIO.read(new File("image3.jpg"));
  
  }
  
  
  /**
   * drawPage method
   * How the gui class and Dnd class interact. 
   * Dnd sends the text for the page to the gui class via this method. 
   * this method places it in the correct variable. 
   * The result is applied when the drawing class repaints the drawing panel. 
   * @param  string a 
   */
      public static void drawPage(String a, String b, String c, String d){
        pageText = a;
        lineTwo =b;
        lineThree = c; 
        lineFour =d;
      }
      /**
       * illustrate method, will have a small selection of images which can be 
       * drawn in the page accompanying the text. Each image has a number, 
       * the number is sent by the page method when illustrate is called, by 
       * @param a which lets the method know which picture to draw
       */
      public static void illustrate(int a){
              picture =a; 
      
      }
      
  /**
   * Drawing panel inner class, 
   * place where the pages and illustrations  are drawn/written 
   * onto the  gui page
   */
  private class DrawingPanel extends JPanel {  //inner class for graphics area
    /**
     * Drawing panel constructor
     */
      DrawingPanel(){
      setPreferredSize(new Dimension (400,400));
      setBackground(Color.white);
    }
      
    
    
    
    /** drawing all the things.
     * @param Graphics g 
     */
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawString(pageText, 10, 10);  
      g.drawString(lineTwo, 20, 20);  
      g.drawString(lineThree, 30, 30);  
      g.drawString(lineFour, 40, 40);  
      if(picture == 3){ //image 3 is witches hat
           g.drawImage(image3, 0, 0, null);
         
          
      }
    }
    

  }//close drawing class


  
  
  /** 
   * Inner class handling button/user interactions. 
   */
  
  private class ButtonListener implements ActionListener{  //inner class for event handling
    /** what to do when a button has been pressed,
     * @param actionevent ae
     */
    public void actionPerformed(ActionEvent aE) {
      Object source = aE.getSource();
      // each button has own reaction.
      if (source == back){  
        D.backPage();
        pageNumber.setText(D.getPage());
      }
      if(source == option1){
        D.nextPage(1);
      }
     if(source == option2){
        D.nextPage(2);
      }
     else {
       D.nextPage(1);
     }
     repaint();
    } //close method
  } //close inner class
  
  
} //close class