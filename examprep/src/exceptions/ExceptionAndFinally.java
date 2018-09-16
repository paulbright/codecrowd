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
public class ExceptionAndFinally {

    public void test(int divisor) {

        int d = 10;

        try {
            d = d / divisor;
            System.out.println(d);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            throw new UnCheckedException();
        } finally {
            System.out.println("inside finally");
        }
    }
}
