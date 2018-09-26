/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execution_order;

/**
 *
 * @author A142400
 */
public class OrderOfExecution {
    String name = "Harry"; 
    int age = 20; 
    
    {
	name = "Jim";
    }
    
    {
	name = "Tomy";
    }
    public OrderOfExecution(){
	System.out.println("inside OrderOfExecution()");
	System.out.println("name :" + name + " age:" + age);
    }
    
    public static void main(String[] args) {
	OrderOfExecution oe = new OrderOfExecution();
    }
    
    {
	age = 60; 
    }
}
