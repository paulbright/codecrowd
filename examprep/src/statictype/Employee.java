/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statictype;

/**
 *
 * @author A142400
 */
public class Employee {
    private static int companyID = 10;
    String name; 
    
    public void printDetails(){
	System.out.println(this.name + ":" + this.companyID);
    }
    
    public static void printCompanyID(){
	System.out.println("company id:" + companyID );
    }
    public static void main(String[] args) {

	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	
	Employee.printCompanyID();
	
	emp1.name = "Jim";
	emp2.name = "Tshepo";
	
	System.out.println(emp1.name + ":" + Employee.companyID);
	System.out.println(emp2.name + ":" + Employee.companyID);
	
	
    }
    
    
}

 class Order {
     static int orderFrom  = 20; 
}