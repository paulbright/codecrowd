/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examquestions;

/**
 *
 * @author paul
 */
class Student {

    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

public class Test2 {

    public static void main(String[] args) {
        Student [] studs = new Student[3]; 
        
        studs[1] = new Student(1,"A");
        studs[2] = new Student(2,"B");
        
        for(Student s: studs){
            System.out.println(s.name);
        }
        
        Student[] students = {
            new Student(101, "Durga"),
            new Student(102, "Ravi"),
            new Student(103, "Shiva"),
            new Student(104, "Pavan")
        };
        System.out.println(students);
        System.out.println(students[2]);
        System.out.println(students[2].rollno);
    }
}
