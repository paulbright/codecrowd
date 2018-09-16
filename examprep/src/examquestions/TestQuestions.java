package examquestions;

import inherit_test.A;
import inherit_test.B;
import inherit_test.Butler;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import references.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulbright
 */
public class TestQuestions {

    public static void main(String[] args) {
//        q1();
//        q2();
//        q3();
//        q4();
//        q5();
//        q6();
//        q8();
//        q9();
//        
//        q10();

//        q11();
//        q12();
          q14();
    }

    private static void q1() {
        double[] ar = new double[2];
        System.out.println(ar[0] + ar[1]);

        Double[] arr = new Double[2];
        System.out.println(arr[0] + arr[1]);
    }

    private static void q2() {
        String s = "ICICINBBRT4";
        System.out.println(s.substring(4, 6));
    }

    private static void m(int x) {
        System.out.println("int");
    }

    private static void m(char x) {
        System.out.println("char");
    }

    private static void q3() {
        int i = 10;
        m(i);
        m('5');
    }

    private static void q4() throws Exception {
        //throw new Exception();  
    }

    private static void q5() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("D");

        list2.add("B");
        list2.add("C");

        list1.addAll(1, list2);
        System.out.println(list1);
    }

    private static void q6() {
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);
    }

    private static void q7() {
        //int  m[][]  = new int [][8];
        int[][] n = new int[8][8];
        //int [] n []  = new int [8][];
        int[] arr = new int[8];
    }

    private static void q8() {
        new B().print();
    }

    private static void q9() {

        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);

    }

    /*
    testing casting and protected access
     */
    private static void q10() {
        A obj1 = new A();
        B obj2 = (B) obj1;
        obj2.print();
//        B obj3 = new B();
//        obj1 = obj3;
//        obj1.test();
        System.out.println(obj1.i1);

        Butler b = new Butler("paul");
        b.testButler2();
        //b.testButler();
    }

    private static void q11() {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    private static void q12() {
        references.Test.main(null);
    }

    private static void q13() {
        byte var = 100;
        switch (var) {
            case 100:
                System.out.println("var is 100");
                break;
//             case 128:
//                 System.out.println("var is 200");
//                 break;
            default:
                System.out.println("In default");
        }
    }

    /*
    You can’t use the switch statement to compare all types of values, such as all types of objects and primitives.
There are limitations on the types of arguments that a switch statement can accept.
A switch statement accepts arguments of type char, byte, short, int, and String(starting from Java version 7).
It also accepts arguments and expressions of types enum, Character, Byte, Integer, and Short, but because these aren’t on the OCAJP exam objectives, We won’t cover them in these article.
The switch statement doesn’t accept arguments of type long, float, double,boolean or any object besides String.
    */
    private static void q14() {
        Character var = 7;
        switch (var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }

    }
}
