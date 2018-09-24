/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.static_classes;

/**
 *
 * @author paulbright
 */

/*
Static classes are basically a way of grouping classes together in Java. Java doesn't allow you to create top-level static classes; only nested (inner) static classes. Let's take a look at an example. 
The only exception to static classes acting like completely separate classes to their enclosing classes, is that static inner classes can access static data members of the enclosing class -- or call static methods, for that matter. 
*/
class Outer {
    abstract static class Animal { //Line 2
        abstract void eat();
    }
    
    static class Dog extends Animal { //Line 6
        void eat() { //Line 7
            System.out.println("Dog eats biscuits");
        }
    }
}
 
public class StaticClassTest {
    public static void main(String[] args) {
        Outer.Animal animal = new Outer.Dog(); //Line 15
        animal.eat();
    }
}
