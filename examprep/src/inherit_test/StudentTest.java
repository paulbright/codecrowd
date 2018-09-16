/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_test;

/**
 *
 * @author paulbright
 */
class Student {
     String name;
     int marks;
 
     Student(String name, int marks) {
         this.name = name;
         this.marks = marks;
     }
}
 
public class StudentTest {
     public static void main(String[] args) {
         Student student = new Student("James", 25);
         int marks = 25;
         review(student, marks);
         System.out.println(marks + "-" + student.marks);
     }
 
     private static void review(Student stud, int marks) {
         marks = marks + 10;
         stud.marks+=marks;
     }
}