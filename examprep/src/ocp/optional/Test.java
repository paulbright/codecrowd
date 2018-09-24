/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.optional;

/**
 *
 * @author paulbright
 */
import java.io.Console;
import java.util.Optional;
 
public class Test {
    public static void main(String[] args) {
        Optional<Console> optional = Optional.ofNullable(System.console());
        if(optional.isPresent()) {
            System.out.println("[" + optional.get() + "]");
        }
    }
}