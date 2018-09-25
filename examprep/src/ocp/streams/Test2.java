/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.streams;

/**
 *
 * @author paulbright
 */
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class Test2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java", "python", "c",
                "c++", "java", "python");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set.size());
        //stream.close();
        stream = Stream.of("java", "python", "c",
                "c++", "java", "python");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list.size());
    }
}