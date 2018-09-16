/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_test;

/**
 *
 * @author paulbright
 */
interface Printable {
     public void setMargin();
     public void setOrientation();
}
 
abstract class Paper implements Printable { //Line 7
     public void setMargin() {}
     //public abstract void setOrientation();
     //Line 9
}
 
class NewsPaper extends Paper { //Line 12
     public void setMargin() {}
     public void setOrientation() {}
     //Line 14
}

public class TestImplent{
    
}