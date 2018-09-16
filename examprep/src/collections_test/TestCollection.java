/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_test;

/**
 *
 * @author paulbright
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class TestCollection {
     public static void main(String [] args) {
         //q1();
         q2();
         q3();
     }
     
     private static void q1(){
         List<Integer> list = new ArrayList<Integer>();
         list.add(new Integer(2));
         list.add(new Integer(1));
         list.add(new Integer(0));
 
         list.remove(list.indexOf(0));
 
         System.out.println(list);
     }
     
     private static void q2(){
         String s = new String("Hello");
         List<String> list = new ArrayList<>();
         list.add(s);
         list.add(new String("Hello"));
         list.add(s);
         s.replace("l", "L");
 
         System.out.println(list);
     }
     
     private static void q3(){
        Dog s = new Dog("Jim");
        List<Dog> list = new ArrayList<>();
        list.add(s);
        list.add(new Dog("Ripper"));
        list.add(s);
      
        Iterator it = list.iterator();
        
        while (it.hasNext()) {
            Dog d = (Dog) it.next();
            System.out.println(d.getName());
        }
        s.setName("Superman");
        
        it = list.iterator();
        
        while (it.hasNext()) {
            Dog d = (Dog) it.next();
            System.out.println(d.getName());
        }
        
        list.get(0).setName("Batman");
        it = list.iterator();
        while (it.hasNext()) {
            Dog d = (Dog) it.next();
            System.out.println(d.getName());
        }
     }
}

class Dog{
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
   public Dog(String name){
       this.name = name;
   }
   
}