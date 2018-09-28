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
public abstract class Clothing implements IClothing {
    private int size;

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    public Color getColor() {
	return color;
    }

    public void setColor(Color color) {
	this.color = color;
    }

    public int getAmount() {
	return amount;
    }

    public void setAmount(int amount) {
	this.amount = amount;
    }
    private Color color;
    private int amount;

    public Clothing(int size, Color color, int amount){
	this.size = size;
	this.color = color; 
	this.amount = amount;
    }
    public void buy() {

    }

    public void addToBasket() {

    }
    
    public String toString(){
	String s = "size:" + size + " color:" + color + " amount:" + amount;
	return s;
    }
    public void display(){
	System.out.println("size:" + size + " color:" + color + " amount:" + amount);
    }
}
