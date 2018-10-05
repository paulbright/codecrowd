/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.IOException;

/**
 *
 * @author A142400
 */
public class ExceptionTester {
    
    public static void main(String[] args) {
	ExceptionTester et = new ExceptionTester();
	int i = 0 ; 
	
	
	try{
	    et.test();
	}catch(IOException ex){
	    //System.out.println("inside IOException catch block");
	    //System.out.println(ex.getMessage());
	    
	    try{
		i = i/1; 
	    } catch (java.lang.ArithmeticException e) {
		//System.out.println("my arthmatic exception " +  e.getMessage());
	    }
	    finally{
		System.out.println("A");
	    }
	}
	finally{
	    System.out.println("B");
	}
	
	
    }
    
    public void test() throws IOException {
	
	throw new IOException("I am throwing IOException");
	//new RuntimeException("Runtime Ex");
    }
    
    public void test2() throws RuntimeException {
	throw new RuntimeException("My Runtime Exception");
    }
    
}
