/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unary;

/**
 *
 * @author paulbright
 */
public class UnaryTest {

    public static void main(String[] args) {

	Test.run();
    }

    private static void q1() {
	int x = 1;
	while (checkAndIncrement(x)) {
	    System.out.println(x);
	}
    }

    private static boolean checkAndIncrement(int x) {
	if (x < 5) {
	    x++;
	    return true;
	} else {
	    return false;
	}
    }
}

class Test {
    char c;
    double d;
    float f = 0.1f;
    int x = (int)c;
    public static void run() {
	Test obj = new Test();
	System.out.println(obj.x );
	System.out.println(">[" + "]");
	System.out.println(">[" + obj.c +"]");
	System.out.println(">" + obj.d);
	System.out.println(">" + obj.f);
    }
}
