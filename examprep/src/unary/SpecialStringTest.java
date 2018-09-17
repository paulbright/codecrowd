/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unary;

/**
 *
 * @author A142400
 */
class SpecialString {
     String str;
     SpecialString(String str) {
         this.str = str;
     }
}
 
public class SpecialStringTest {
     public static void main(String[] args) {
         System.out.println(new String("Java"));
         System.out.println(new StringBuilder("Java"));
         System.out.println(new SpecialString("Java"));
     }
}
