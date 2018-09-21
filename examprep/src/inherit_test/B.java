/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_test;

import inherit_test.newpackage.A;

/**
 *
 * @author paulbright
 */
public class B extends A {
    
     public void print() {
         A obj = new A();
         System.out.println(obj.i1); //Line 8
//         System.out.println(obj.i2); //Line 9
         System.out.println(this.i2); //Line 10
         System.out.println(super.i2); //Line 11
     }
     public void test(){
         System.out.println("inside B");
     }
     public static void main(String [] args) {
         new B().print();
     }
}
