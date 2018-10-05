/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.diamondoperator;

/**
 *
 * @author paulbright
 */
class Printer<String> {
    private String t;
    Printer(String t){
        this.t = t;
    }
}
 
public class Test {
    public static void main(String[] args) {
        Printer<Integer> obj = new Printer<>(100);
        System.out.println(obj);
    }
}