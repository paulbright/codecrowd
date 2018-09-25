/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author paulbright
 */
interface I1 {
    void m1() throws java.io.IOException;
    void m2() throws java.lang.Exception;
}

abstract class A {
    public abstract void n1() throws java.io.IOException;
}
public class Test1 extends A implements I1 {

    @Override
    public void n1() {
        System.out.println("hello");
        throw new RuntimeException();
    }
    //public void m1() throws IOException {}
    
    
    //public void m1() throws FileNotFoundException {}

    //public void m1() throws Exception {}
    
    public void m1() {}
    
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.n1();
    }

   
    //public void m2() throws Exception {}
    public void m2() throws IOException {}
    
}