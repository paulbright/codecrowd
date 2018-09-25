/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.lambdas;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author paulbright
 */

interface Operation {
    //int operate(int x, int y);
    long operate(long x, long y);
}
public class Test {
    public static void main(String[] args) {
        q1();
    }
    public static void q2() {
        List<String> codes = Arrays.asList("1st", "2nd", "3rd", "4th");
        System.out.println(codes.stream().filter(
                s -> s.endsWith("d")).reduce((s1, s2) -> s1 + s2));
    }
    
    public static void q1() {
        Operation o1 = (x, y) -> x + y; 
        System.out.println(o1.operate(5, 10));
    }
}
