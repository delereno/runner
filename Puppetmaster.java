/* Based on the ecs 100 template
 * Code for ??
 * Name:
 * Date:
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** <description of class Puppetmaster>
 */
public class Puppetmaster{
    
    // fields to store values beween events/method calls
    //private ...
    
    // methods to respond to the buttons, slider, textField
    //public void...
    
    //main setup GUI
    
    public static void main(String[] args){
        // make a PuppetMaster object
        Puppetmaster pm = new Puppetmaster();
        
        // setup the buttons, slider, textField, to call methods on the object
        // UI.addButton("",pm::);
        // UI.addButton("",pm::);
        // UI.addButton("",pm::);
        // UI.addButton("",pm::);
        // UI.addButton("",pm::);
        
    }
    
    /**      */
    public Puppetmaster(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);
    }



    

}

