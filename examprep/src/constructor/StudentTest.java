/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author A142400
 */
class Student {
     String name;
     int age;
 
     void Student() {
         Student("James", 25);
     }
 
     void Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
}
 
public class StudentTest {
     public static void main(String[] args) {
         Student s = new Student();
         System.out.println(s.name + ":" + s.age);
     }
}