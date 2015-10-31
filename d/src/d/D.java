    /*
     * D.java, 
     * Short for dungeons and dragons. 
     * A silly high fantasy interactive fictiony thing. 
     */

    /**
     *
     * @author MHowse
     */

    package d; 
    
    
   

import java.awt.Graphics.*;
import javax.swing.*;

public class D {
  
  protected static int [] history = new int [10];
  protected int pageNumber;
 
  //current options to consider before continuing,
  //make page object in binary tree? option 1/2 == branch right left,
  //back == go up tree  towards root. or keep history array?
  //history array allows for keeping track of dead end-backtracking adventures better
 protected  static int pageCount;
  protected  static int currentPage = history[pageCount]; //one currently on. 
  protected  static int prevoiusPage = history[pageCount-1];
  protected static int pageNumberValue;
  protected static String one= "";
  /**
   * Turns back  page once user has made decision. 
   * Works out which page was up previous to the current one, and 
   * tells pageTurn to turn to that one. 
   * @param evt 
   * @return void
   */
  public static void backPage(){
    pageTurn(prevoiusPage);
    
  }
  
  /**
   * Turns the next page once user has made decision.
   * Decides which page is turned to.
   * Passes decision to page turning method.
   * @param int n which indicates users decision 
   * @return void
   */
  public static void nextPage(int n){
    //If first option n will be one, if second, will be two.  
    String page = Integer.toString(history[pageNumberValue]); 
//find current page in array
    page = page+ n; //option 1 = odd numbers; 
    //option 2 = even numbers
    pageTurn(Integer.parseInt(page)); //change pages; 
  }
  
  public  static void pageTurn( int a ){
    pageCount++;
    history[pageCount] = pageNumberValue; //record
    pageNumberValue = a; //set check value
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
      case 4:
        page4();
        break;
      default:
        
        
    }
  }
  
  public static String getPage(){
    String p = ""+currentPage;
    return p;
  }
  public   static int currentPage(){
    return history[pageCount];
  }
  
  public  static int prevoiusPage(){
    if (pageCount ==0){
      return pageCount;
    } 
    return history[pageCount-1];
  }
  
  public static void prolouge(){
    one = "This is a dnd inspired roll your own adventure interactive fiction";
    gui.drawPage(one);
    history[0] = 0;
    pageCount = 0;
  }
  
  public static void page1 (){ 
    //set page text field to the page. 
    one = "This is the begining of the story";
    gui.drawPage(one);
    //add some ascii art. 
  }
  
  public static void page2 (){
    String derp ="derp";
    //gui.displayString(derp);
  }
  
  public static void page3(){
    
  }
  public static void page4(){
    
  }
}//end class

       