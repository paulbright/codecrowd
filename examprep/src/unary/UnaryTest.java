/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unary;

/**
 *
 * @author paulbright
 */
public class UnaryTest {
     public static void main(String[] args) {
         int x = 1;
         while(checkAndIncrement(x)) {
             System.out.println(x);
         }
     }
 
     private static boolean checkAndIncrement(int x) {
         if(x < 5) {
             x++;
             return true;
         } else {
             return false;
         }
     }
}
