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
public class ExecTest {
    
    private static int y = 20; 
    
    {
        System.out.println("inside ExecTest init block");
        x = 9;
    }
    
    {
        System.out.println("inside ExecTest init block2");
        x = 10;
    }
    private int x = 8;
    
    static{
        System.out.println("inside ExecTest static block"); 
        y = 30;
    }
    
    
    public ExecTest(){
        System.out.println("inside ExecTest constructor");
        //x = 10;
    }
    
    public void test(){
        System.out.println(x);
        System.out.println(y);
    }
    
    static{
        System.out.println("inside ExecTest static block2"); 
        y = 40;
    }
}
