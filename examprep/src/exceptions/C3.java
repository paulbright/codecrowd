/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author paulbright
 */
public class C3 {
    public static void main(String[] args) {
        try{
            System.out.println("1");
            throw new Exception();
        }catch(Exception ex){
            System.out.println("2");
            Scanner scanner = new Scanner(System. in); 
            String input = scanner. nextLine();
        }finally{
            System.out.println("3");
        }
        
    }
}
