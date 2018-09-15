/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execution_order;

/**
 *
 * @author paulbright
 */
public class TestExecutionOrder {
    ExecTest ex = new ExecTest();
    
    public static void main(String[] args) {
        TestExecutionOrder te = new TestExecutionOrder();
        te.ex.test();
    }
}
