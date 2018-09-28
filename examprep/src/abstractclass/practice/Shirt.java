/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.practice;

import java.awt.Color;

/**
 *
 * @author A142400
 */
public class Shirt extends Clothing{
    private String brand = "noname"; 
    
    public Shirt(int size, Color color, int amount){
	this("noname", size, color, amount);
    }
    public Shirt(String brand, int size, Color color, int amount){
	super(size, color, amount);
	this.brand = brand; 
    }
    
    public String toString(){
	String s = super.toString();
	return this.brand + s;
    }
    public void display(){
	System.out.println("shirt brand is:" + this.brand);
	super.display();
    }
}
