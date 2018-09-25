/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.childclasses;

/**
 *
 * @author paulbright
 */
class A {
    public void someMethod(final String name) {
        class B {
            void print() {
                System.out.println("Hello " + name);
            }
        }
//        class C extends B{
//            void print() {
//                new B().print();
//            }
//        }
        new B().print();
        
    }
}
 
public class Test {
    public static void main(String[] args) {
        new A().someMethod("World!");
    }
}