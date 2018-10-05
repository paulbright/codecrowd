/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A142400
 */


public class TestLists {
    
    public static void main(String[] args) {

	List <Student> students = new ArrayList<Student>();
	
	Student s1 = new Student("Roxeanne", 20);
	Student s2 = new Student("Tshepo", 20);
	Student s3 = new Student("Ronaldo", 30);
	
	students.add(s1);
	students.add(s2);
	students.add(s3);
	
	System.out.println(students);
	s2.setAge(50);
	System.out.println(students);
	
	List ages = new ArrayList();
	
	int a=10;
	int b = 20;
	int c = 50; 
	
	ages.add(a);
	ages.add(b);
	ages.add(c);
	
	System.out.println(ages);
	a = 90;
	System.out.println(ages);
	
	List <String> names = new ArrayList<String>(); 
	
	String n1 = "Jim";
	String n2 = "Tshepo";
	String n3 = "Kevin"; 
	
	names.add(n1);
	names.add(n2);
	names.add(n3);
	
	System.out.println(names);
	n1 = "Andre"; 
	System.out.println(names);
	
    }
}
