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

/*
When an new exception is thrown in a catch block or finally block that will propagate out of that block, then the current exception will be aborted (and forgotten) as the new exception is propagated outward. The new exception starts unwinding up the stack just like any other exception, aborting out of the current block (the catch or finally block) and subject to any applicable catch or finally blocks along the way.

Note that applicable catch or finally blocks includes:

When a new exception is thrown in a catch block, the new exception is still subject to that catch's finally block, if any.

Now retrace the execution remembering that, whenever you hit throw, you should abort tracing the current exception and start tracing the new exception.
 */
class MyExc1 extends Exception {}
class MyExc2 extends Exception {}
class MyExc3 extends MyExc2 {}

public class C1 {
    public static void main(String[] args) throws Exception {
        
       
        try {
            System.out.print(1);
            q();
        }
        catch (Exception i) {
            System.out.print('b');
            throw new MyExc2();
        }
        finally {
            System.out.print(2);
            throw new MyExc1();
        }
        
    }

    static void q() throws Exception {
        try {
            throw new MyExc1();
        }
        catch (Exception y) {
            System.out.print('a');
        }
        finally {
            System.out.print(3);
            throw new Exception();
        }
    }
}
