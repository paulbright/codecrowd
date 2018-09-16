/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc;

/**
 *
 * @author paulbright
 */
class Pen {
     public String name;
     Pen(String name){
         this.name = name;
     }
     
}
 
public class TestPen {
     public static void main(String[] args) {
         new Pen("A"); //Line 1
         Pen p = new Pen("B"); // Line 2
         change(p); //Line 3
         System.out.println("About to end."); //Line 4
         System.out.println(p.name);
     }
 
     public static void change(Pen pen) { //Line 5
         pen = new Pen("C"); //Line 6
     }
}
