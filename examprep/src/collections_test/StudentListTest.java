/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A142400
 */
class Student {
     private String name;
     private int age;
 
     Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
     
     public void setAge(int age){
	 this.age = age; 
     }
     /*
     public boolean equals(Object obj){
	 return true;
     }
     */
     public String toString() {
         return "Student[" + name + ", " + age + "]";
     }
}
 
public class StudentListTest {
     public static void main(String[] args) {
         List<Student> students = new ArrayList<>();
         students.add(new Student("James", 25));
         students.add(new Student("James", 27));
         students.add(new Student("James", 25));
         students.add(new Student("James", 25));
 
         students.remove(new Student("James", 25));
	 /*
	 students.remove(new Student("James", 25));
	 students.remove(new Student("James", 25));
	 students.remove(new Student("James", 25));
	*/
         for(Student stud : students) {
             System.out.println(stud);
         }
     }
}
