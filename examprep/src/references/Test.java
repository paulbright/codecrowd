/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package references;

/**
 *
 * @author paulbright
 */
class Message {
     String msg = "Happy New Year!";
 
     public void print() {
         System.out.println(msg);
     }
}
 
public class Test {
     public static void change(Message m) {
         //m.msg = "Wow!";
         m = new Message();
         m.msg = "Happy Holidays!";
     }
 
     public static void main(String[] args) {
         Message obj = new Message();
         obj.print();
         change(obj);
         obj.print();
	 
	 //point_test();
     }
     
     public static void point_test() {
         Point p1 = new Point();
         p1.x = 10;
         p1.y = 20;
         Point p2 = new Point();
         p2.assign(p1.x, p1.y);
         System.out.println(p1.toString() + ";" + p2.toString());
     }
}


class Point {
     int x;
     int y;
     void assign(int x, int y) {
         x = this.x;
         this.y = y;
     }
 
     public String toString() {
         return "Point(" + x + ", " + y + ")";
     }
}
 