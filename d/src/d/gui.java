/*gui.java
 * MHowse/cleddyf october 2015
 * aka I give up on netbeans automatically generated bloat code and do it all by hand.
 */

package d;
/*To do;
 * comment everthing 
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
import javax.swing.WindowConstants;

/**
 * Start of gui class
 */
public class gui extends JPanel {
 /**
  * Declare and initialize variables, 
  * Buttons, textfields for displaying current page number
  * other relevant things. 
  */
  private final JButton back = new JButton ("back");
  private final JButton option1 = new JButton ("Option 1");
  private final JButton option2 = new JButton ("Option 2");
  private final JTextField pageNumber = new JTextField("##");  
  private final JLabel pageLabel = new JLabel("Current page");
  //protected int count;
  protected int pageNo;
  private final Timer timer;
  protected static String pageText = "start";
  protected static String lineTwo = " ";
  protected static String lineThree = "  ";
  protected static String lineFour = "  ";
    protected static String lineFive = "  ";
      protected static String lineSix= "  ";
  protected static int picture = 0;
  private final int DELAY = 10;   
  private final int fontSize =20;
  JButton []  buttonArray = { back, option1, option2};
  public static int imageNo=3;
  
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
     * @param args
   * @param string args 
     * @throws java.io.IOException 
   */
  public  static void main(String[]args) throws IOException{
    JFrame shapeFrame = new JFrame();
    shapeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    shapeFrame.getContentPane().add(new gui());
    shapeFrame.pack();
    shapeFrame.setVisible(true);
    shapeFrame.setTitle("shape panels and random circles");
   
  }
   
  /**
   * drawPage method
   * How the gui class and Dnd class interact. 
   * Dnd sends the text for the page to the gui class via this method. 
   * this method places it in the correct variable. 
   * The result is applied when the drawing class repaints the drawing panel. 
   * @param  string a 
   */
      public static void drawPage(String a, String b, String c, String d, String e, String f){
        pageText = a;
        lineTwo =b;
        lineThree = c; 
        lineFour =d;
        lineFive =e;
        lineSix = f; 
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
        private BufferedImage image;
        
    /**
     * Drawing panel constructor
     * Make, set size, background, set up Font options. 
     */
      DrawingPanel(){
      setPreferredSize(new Dimension (400,400));
      setBackground(Color.white);
      String FontList[];
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      FontList = ge.getAvailableFontFamilyNames();
    }
      
    /**
   * Images declared and buffered for loading when page turned. 
   */
  
  public void imageLoad(int a){
    //image1 = ImageIO.read(new File("image1.jpg"));
    //image2 = ImageIO.read(new File("image2.jpg"));
         try {
             if (a ==3){
                image = ImageIO.read(DrawingPanel.class.getResource("image3.jpg"));
             }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
    
  }
  
    
    
    /** drawing all the things.
     * @param Graphics g 
     */
    public void paintComponent(Graphics g){
       imageLoad(gui.imageNo);
       g.setFont(new Font("Comic Sans", Font.PLAIN, fontSize)); 
      super.paintComponent(g);
      g.drawString(pageText, 10, 20);  
      g.drawString(lineTwo, 10, 45);  
      g.drawString(lineThree, 10, 75);  
      g.drawString(lineFour, 10, 100); 
      g.drawString(lineFive, 10, 125);
      g.drawString(lineSix, 10, 150);
      if(picture == 3){ //image 3 is witch. 
       g.drawImage(image, 50, 175, null);
         System.out.println("image drawn");
          
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