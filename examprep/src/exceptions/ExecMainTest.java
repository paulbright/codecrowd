/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author A142400
 */
public class ExecMainTest {
     public static void main(String[] args) {
         try {
             main(args);
         } catch (Exception ex) {
             System.out.println("CATCH-");
         }
             System.out.println("OUT");
     }
     
     
}
