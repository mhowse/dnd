/**
 * food.java
 */

package d.grid;

    
import java.awt.*;

public class food{
  protected int size, x,y;
  protected Color colour;
 
  
 /**
  * 
  * @param a  
  * @param xc the x coordinate
  * @param yc  the y coordinate
  */
  public food(int a,int xc, int yc ) { 
    colour= Color.GREEN;
    size =a;
    x = xc;
    y = yc;
  }

 
  public  void display (Graphics g){ //to display shapes
    g.fillOval(x,y,size, size);
} 

}//end class 