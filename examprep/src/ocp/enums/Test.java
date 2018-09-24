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

/*

Note: All enums implicitly extend java.lang.Enum. Because a class can only extend one parent (see Declaring Classes), the Java language does not support multiple inheritance of state (see Multiple Inheritance of State, Implementation, and Type), and therefore an enum cannot extend anything else.
Note: The constructor for an enum type must be package-private or private access. It automatically creates the constants that are defined at the beginning of the enum body. You cannot invoke an enum constructor yourself.
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