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
public class Secretary extends Employee implements ICanDrive{
    
    public Secretary(String name) {
        super(name);
    }
    
}
