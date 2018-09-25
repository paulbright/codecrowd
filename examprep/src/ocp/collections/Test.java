/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.collections;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulbright
 */
public class Test {
    
    
    public static void main(String[] args) {
        //q1();
        q2();
    }
    public static void q2() {
        LocalTime ta = LocalTime.now();
        LocalTime tb = LocalTime.now();
        System.out.println(Duration.between(ta, tb));
        LocalDateTime t1 = LocalDateTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        System.out.println(Duration.between(t2, t1));
    }
    
    public static void q1() {
        List<? super String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        //for(String str : list) {
        for(Object str : list) {
            System.out.print(str);
        }
    }
}
