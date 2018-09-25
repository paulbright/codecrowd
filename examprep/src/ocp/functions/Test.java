/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author paulbright
 */
interface StringConsumer extends Consumer<String> {
    @Override
    public default void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}
class SC implements StringConsumer{
    
}
public class Test {
    public static void main(String[] args) {
       
    //    StringConsumer consumer = s -> System.out.println(s.toLowerCase());
        List<String> list = Arrays.asList("Dr", "Mr", "Miss", "Mrs");
     //   list.forEach(consumer);
     //list.forEach(String);
    }
}