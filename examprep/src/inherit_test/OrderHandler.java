/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_test;
/**
 *
 * @author A142400
 */

interface IOrder {
    public void process(); 
    public void display(); 
}

class StoreOrder implements IOrder {

    @Override
    public void process() {
	System.out.println("processing StoreOder");
    }

    @Override
    public void display() {
	System.out.println("displaying StoreOder");
    }
    
}

class OnlineOrder implements IOrder {
    private static final int MAXROBOTS = 50; 
    
    @Override
    public void process() {
	System.out.println("processing OnlineOrder");
    }

    @Override
    public void display() {
	System.out.println("displaying OnlineOrder");
    }
    
}
public class OrderHandler {
    public static void main(String[] args) {
	StoreOrder so = new StoreOrder();
	OnlineOrder oo = new OnlineOrder();
	
	orderprocess(oo);
	orderprocess(so);
	displayprocess(oo);
	displayprocess(so);
    }
    
    public static void orderprocess(IOrder order){
	order.process();
    }
    
    public static void displayprocess(IOrder order){
	order.display();
    }
}

interface IJavaDeveloper {
    public void packageClasses();
}

interface IPythonDeveloper {    
}

interface ICDeveloper {
    public void makeLibraries();
}




class Candidate implements IJavaDeveloper, IPythonDeveloper, ICDeveloper{
    public static void main(String[] args) {
	Candidate c = new Candidate();
	if ( c instanceof IJavaDeveloper) {
	    System.out.println("Candidate is a java developer");
	}
	
	if ( c instanceof IPythonDeveloper) {
	    System.out.println("Candidate is a python developer");
	}
	
	Architect ar = new Architect();
	ar.packageClasses();
    }

    @Override
    public void packageClasses() {
	
    }

    @Override
    public void makeLibraries() {
	
    }

  
}

 abstract class NewCandidate implements IJavaDeveloper 
 {
    @Override
    public void packageClasses() {
	System.out.println("NewCandidate implementation of packages");
    }
 }

class Developer extends NewCandidate{

    @Override
    public void packageClasses() {
    }
    
}

class NewDeveloper implements IJavaDeveloper{

    @Override
    public void packageClasses() {
    }
}


class Architect extends NewCandidate{

    @Override
    public void packageClasses() {
	System.out.println("Architect implementation of packages");
	super.packageClasses();
    }
    
}