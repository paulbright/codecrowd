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
public class Employee {
    private String name; 
    private int age;

    public Employee(String name, int age){
	this.name = name;
	this.age = age;
    }
    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }
    public void setName(String name){
	this.name = name;
    }
    
    public String getName(){
	return name;
    }
}

