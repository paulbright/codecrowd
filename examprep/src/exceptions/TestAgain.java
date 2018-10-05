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

public class TestAgain {
     public static void main(String[] args)  {
	 try{
	    m1(); //Line 3
	 }
	 catch(Exception ex){
	     
	 }
     }
 
     private static void m1() throws Exception { //Line 6
         System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
     }
}