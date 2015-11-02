    /*
     * D.java, 
     * Short for dungeons and dragons. 
     * A silly high fantasy interactive fictiony thing. 
     * November 2015
     * @author MHowse
     */

    package d; 
    
    
   
/**
 * Import graphics and swing libraries.
 */
import java.awt.Graphics.*;
import javax.swing.*;

    /**
     * Declare class.
     */
public class D {
  
    /**
     * Declare and initialize class variables
     */
  protected static int [] history = new int [10]; 
//keeps track of what pages have been visited in what order. 
  protected int pageNumber;
 
  //current options to consider before continuing,
  //make page object in binary tree? option 1/2 == branch right left,
  //back == go up tree  towards root. or keep history array?
  //history array allows for keeping track of dead end-backtracking adventures better
 protected  static int pageCount; // how many pages through story we are
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
  
  /**
   * pageTurn, keeps variables in correct state and calls 
   * the methods required to make the page turn come into effect.
   * @param int a : a is the page to be turned to 
   */
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
  
  /**
   *  Accessor method that says which page user is currently on. 
   * In string form.
   * @return string that is the page.
   */
  public static String getPage(){
    String p = Integer.toString(currentPage);
    return p;
  }
  /**
   *  Accessor method that says which page user is currently on. 
   * In int form
   * @return int  that is the page.
   */
  public   static int currentPage(){
    return history[pageCount];
  }
  
  /**
   *  Accessor method that says which page user was  previuosly on. 
   * In int form.
   * @return in that is the page number.
   */
  public  static int prevoiusPage(){
    if (pageCount ==0){
      return pageCount;
    } 
    return history[pageCount-1];
  }
  
  /**
   * Initial page loaded thing. 
   */
  public static void prolouge(){
    one = "This is a dnd inspired roll your own adventure interactive fiction";
    gui.drawPage(one);
    history[0] = 0;
    pageCount = 0;
  }
  
  /**
   *  method for the first page,initialise the string that will be the page text
   * then send it to the gui to be displayed. 
   */
  public static void page1 (){ 
    //set page text field to the page. 
    one = "This is the begining of the story";
    gui.drawPage(one);
    //add some ascii art. 
  }
   /**
   *  method for the second page,initialise the string that will be the page
   * text
   * then send it to the gui to be displayed. 
   */
  public static void page2 (){
    String derp ="derp";
    //gui.displayString(derp);
  }
   /**
   *  method for the third page,initialise the string that will be the page 
   * text
   * then send it to the gui to be displayed. 
   */
  public static void page3(){
    
  }
   /**
   *  method for the fourth page,initialise the string that will be the page text
   * then send it to the gui to be displayed. 
   */
  public static void page4(){
    
  }
}//end class

       