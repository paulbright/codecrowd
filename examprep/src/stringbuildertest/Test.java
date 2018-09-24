/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuildertest;

/**
 *
 * @author paulbright
 */
public class Test {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java!");
        StringBuilder sb2 = new StringBuilder("java!");
        StringBuilder sb3 = sb;
                
        String s = new String ("java!");
        
        System.out.println(s.equals(sb));
        System.out.println(s.equals(sb.toString()));
        //System.out.println(s.equalsIgnoreCase(sb));
        System.out.println(s.equalsIgnoreCase(sb.toString()));
        
        
        System.out.println(sb.equals(s));
        System.out.println(sb.equals(s.toString()));
        
        System.out.println(sb.equals(sb3));
        
    }
    
}
