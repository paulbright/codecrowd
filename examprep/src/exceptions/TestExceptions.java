/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import execution_order.TestExecutionOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulbright
 */
public class TestExceptions {
    public static void main(String[] args) {
        //testMyWork();
        testFinally();
    }

    private static void testMyWork() {
        MyWork my = new MyWork();
        try {
            my.testChecked(1);
        } catch (CheckedException ex) {
            Logger.getLogger(TestExceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        my.testUnChecked(1);
    }

    private static void testFinally() {
        ExceptionAndFinally exf = new ExceptionAndFinally();
        exf.test(0);
    }
    
    
}

class MyWork{
    
    public void testChecked(int x) throws CheckedException
    {
        if(x < 10) throw new CheckedException();
    }
    
    public void testUnChecked(int x) throws UnCheckedException
    {
        if(x < 10) throw new UnCheckedException();
    }
}