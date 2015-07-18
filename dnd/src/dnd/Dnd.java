/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd;
import java.util.*;
/**
 *
 * @author cleddyf
 */
public class Dnd {
 
    /**
     * This will be an emulation of old fashioned roll your own adventure books. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    /*Roll dice method, decides which page to turn  to next*/
    public static int rollDice(){
        int dice;
        Random rand = new Random (); 
        dice = rand.nextInt(7);
        return dice;
}

}// end of class