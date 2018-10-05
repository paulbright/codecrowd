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
     
     public String toString(){
	 return this.name + ":" + this.marks;
     }
}
 
public class StudentTest {
     public static void main(String[] args) {
         Student student = new Student("James", 25);
         int marks = 25;
	 StringBuilder sb = new StringBuilder("hello");
         review(student, marks);
         //System.out.println(marks + "-" + student.marks);
	 //System.out.println(sb);
	 
	 test();
     }
     
     public static void test() {
         String str = "java";
         StringBuilder sb = new StringBuilder("java");
 
         System.out.println(str.equals(sb));
     }
     private static void review(Student stud, int marks) {
         marks = marks + 10;
         stud.marks+=marks;
     }
}