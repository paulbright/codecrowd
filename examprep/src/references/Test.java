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
     }
}
