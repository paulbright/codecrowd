/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morequestions;

/**
 *
 * @author paulbright
 */
public class NewClass {
    public static void main(String args[]) {
        int a = Integer.MIN_VALUE;
        int b = -a;
        System.out.println(a +":" + b);
        int [] ar = new int[0];
        Integer [] arr = new Integer [0];
        System.out.println(ar.length);
        System.out.println(arr.length);
        
        arr = new Integer[1];
        System.out.println(arr[0]);
        
        String s = "3434";
        
        int i = 1234567890;
        float f = i; 
        System.out.println(i - (int)f);
        
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int n = 1; 
        long l = 1;
        System.out.println( i1 == i2);
        System.out.println(i1 == n);
        System.out.println(i1 == l);
       String hello = "hello";
       hello.replace('h', 'w');
        System.out.println("hello".replace('h', 'w'));
    }
    
    private class X{
        private static final int x = 99;
    }
    
}


