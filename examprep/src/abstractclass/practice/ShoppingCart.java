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
public class ShoppingCart {
    public static void main(String[] args) {
	Shirt ppShirt = new Shirt(IClothing.SIZELARGE, Color.BLUE, 200); 
	//Shirt s = new Shirt("Levis"); 
	System.out.println(ppShirt.getAmount());
	System.out.println(ppShirt);
//	s.addToBasket();
//	s.buy();
//	s.display();
    }
    
}
