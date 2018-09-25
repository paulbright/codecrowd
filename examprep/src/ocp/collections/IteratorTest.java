/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author paulbright
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list.listIterator(2);
        while(iter.hasNext()) {
            System.out.print(iter.next());
        }
    }
}

