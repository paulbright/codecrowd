/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.streams;

/**
 *
 * @author paulbright
 */
import java.util.stream.IntStream;
 
public class Test {
    public static void main(String[] args) {
        int res = 1;
        IntStream stream = IntStream.rangeClosed(1, 5);
        //System.out.println(stream.reduce(res, (i,j) -> i * j));
        //System.out.println(stream.reduce(1, (i,j) -> i * j));
        //System.out.println(stream.reduce(0, (i,j) -> i * j));
        
    }
}