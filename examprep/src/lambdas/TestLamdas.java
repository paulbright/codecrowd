/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.function.Predicate;

/**
 *
 * @author A142400
 */
public class TestLamdas {

    public static void main(String[] args) {	
	q1();
    }

    public static void q1() {
	Predicate<String> i = (s) -> s.length() > 5;
	System.out.println(i.test("java2s.com "));
    }
}
