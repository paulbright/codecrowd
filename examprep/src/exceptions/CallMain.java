/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author A142400
 */
public class CallMain {
    
    
    public static void main(String[] args) {
         CallMain cm = new CallMain(); 
	 cm.printagain(5);
     }
    
    public void printagain(int x) {
	if(x > 10) return; 
	++x;
	printagain(x);	
	System.out.println(x);
    }
}
