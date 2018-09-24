/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.enums;

/**
 *
 * @author paulbright
 */
enum Flags {
    TRUE, FALSE, HELLO, BYE, OKAY;
 
    Flags() {
        System.out.println("HELLO");
    }
}
 

public class Test {
    public static void main(String[] args) {
        //Flags flags = new Flags();
       
        System.out.println(Flags.HELLO);
        System.out.println(Flags.OKAY);
    }
}