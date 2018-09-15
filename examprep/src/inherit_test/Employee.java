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
public abstract class Employee {
    private String name;
    
    public Employee(String name){
        this.name = name;
    }
    
    protected String getName(){
        return name;
    }
}
