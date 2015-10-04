    /*textPanel.java
     * MHowse sept 2015
     */

    package d;

    import java.awt.*;
    import javax.swing.*;
    import java.awt.event.*;
    //import  java.util.ArrayList.indexOf();

    public class textPanel extends JPanel {

      private final JButton option1 = new JButton ("Option 1");
      private final JButton option2 = new JButton ("Option 2");
      private final JButton back = new JButton ("Back");
      protected final JTextField pagefield = new JTextField("##"); 
      protected static final int [] history = new int [10];
      protected static int pageNumberValue;
      protected static int pageCount;
      private  Timer timer;
      private final int DELAY = 10;        
      JButton []  buttonArray = {back, option1, option2};
      public static JPanel controlPanel = new JPanel();
        /** TextArea  text is where the story and ascii art will appear.
         */ 
      public  TextArea text = new TextArea(); 

      /** make and add the graphical components,  constructor of the text pane;*/ 
      public  textPanel(){  
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
        text.getPreferredSize(300, 400000);
        add(text);
        text.setEditable(false); 
      }  
      /** main method
       * @param args 
       */

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
        @Override
        public void paintComponent(Graphics g){
          super.paintComponent(g);
        }    
      }//close drawing class 


      /** setting up interaction*/
      private class ButtonListener implements ActionListener{  //inner class for event handling
        /** what to do when a button has been pressed */
        @Override
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
            if ("Option 1".equals(button.getText())){  
              timer.stop();
            }else {
              if ("Option 2".equals(button.getText())) { 
                timer.start();
              }
            }
          }
          repaint();   //As time passes things change. 


        } // method
      }//inner class
      } //close class