/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author A142400
 */
public class CreateEmployees {
    public static void main(String[] args) {
	Employee emp = new Employee("Jim", 30);
	
	System.out.println(emp.getName() + ":" +  emp.getAge());
    }
}
