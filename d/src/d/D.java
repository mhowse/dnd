    /*
     * D.java, 
     * Short for dungeons, as in and dragons. 
     * A silly high fantasy interactive fictiony thing. 
     */

    /**
     *
     * @author MHowse
     */

    package d; 
    import static d.textPanel.pageCount;
    import java.awt.Graphics.*;
    import javax.swing.*;

    public class D {

        public static void nextPage(int n){
             //If first option n will be one, if second, will be two.  
                String page = ""+textPanel.history[textPanel.pageNumberValue]; 
//find current page in array
                 page = page+ n; //option 1 = odd numbers; 
                pageTurn(Integer.parseInt(page)); //change pages; 
        }

        public static void pageTurn( int a ){
        textPanel.history[pageCount +1] = textPanel.pageNumberValue;
        textPanel.pageNumberValue = a; 
        //call new page;
        switch(a){
            case 1: 
                page1();
                break;
            case 2: 
                page2();
                break;
            case 3:
                page3();
                break;
            default:
                
                
        }
        }

      public static  void page1 (){
        //set page text field to the page. 
        String one = "This is the begining of the story";
        //add some ascii art. 
      }
      
      public static void page2 (){
      }

      public static void page3(){

    }
   
    }// end of class
