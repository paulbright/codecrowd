/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author paulbright
 */
public class UnCheckedException extends RuntimeException{
    public UnCheckedException(){
        super("My Unchecked Exception");
    }
}
