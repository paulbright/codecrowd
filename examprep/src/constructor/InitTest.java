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
class PenDrive {
     int capacity;
     PenDrive(int capacity) {
         this.capacity = capacity;
     }
}
 
class OTG extends PenDrive {
     String type;
     OTG(int capacity, String type) {
         //TODO
	 super(capacity);
	 this.type = type;
     }
}
 
public class InitTest {
     public static void main(String[] args) {
         OTG obj = new OTG(64, "TYPE-C");
         System.out.println(obj.capacity + ":" + obj.type);
     }
}
