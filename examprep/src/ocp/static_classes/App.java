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
class CarParts {
    private int x;
    public int y;
    protected int z; 
    public static int a = 99; 
    
    public static class Wheel {
        public Wheel() {
            System.out.println("Wheel created!");
            System.out.println(a);
        }
    }

    public CarParts() {
        System.out.println("Car Parts object created!");
    }
}
 
public class App{
    public static void main(String[] args) {
        CarParts cp = new CarParts();
        CarParts.Wheel wh = new CarParts.Wheel();
    }
}