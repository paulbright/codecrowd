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
public class Butler extends Employee implements ICanDrive, ICanCook{
    
    public Butler(String name) {
        super(name);
    }
    
    public boolean equals(Object c){
        if(c == this) return true;
        if( ! (c instanceof Butler)) return false;
        Butler b = (Butler) c; 
        if(b.getName().equalsIgnoreCase(this.getName())) return true;
        
        return false;
    }
}
