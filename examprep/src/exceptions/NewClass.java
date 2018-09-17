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
class TestException {
     static {
         System.out.println(1/0);
	 System.out.println(1.0/0);
	 System.out.println(1/0.0);
     }
 
     public static void main(String[] args) {
         System.out.println("HELLO");
     }
}
