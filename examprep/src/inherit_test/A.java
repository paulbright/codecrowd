/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_test;

/**
 *
 * @author paulbright
 */
public class A {
     public int i1 = 1;
     protected int i2 = 2;
     
     public void test(){
         System.out.println("inside A");
     }
     
     protected void protTest(){
         System.out.println("inside protTest A");
     }
}