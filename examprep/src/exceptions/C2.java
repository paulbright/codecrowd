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
public class C2 {

    public static void main(String[] args) {
        try {
            //int i = 1;
            //i = i/0;
            try {
                try {
                    throw new Exception();

                } catch (Exception ex) {
                       System.out.println(1);
                }finally{
                    System.out.println("a");
                }
            } catch (Exception ex) {
                System.out.println(2);
            }finally{
                System.out.println("b");
            }
        } catch (Exception ex) {
            System.out.println(3);
        }finally{
            System.out.println("c");
        }
    }

}
