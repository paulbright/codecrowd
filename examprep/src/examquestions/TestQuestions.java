package examquestions;

import inherit_test.B;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
        //q1();
//        q2();
//        q3();
        //q4();
//        q5();
//        q6();
//        q8();
        q9();
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
    private static void q8(){
        new B().print();
    }
    private static void q9() {

        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);

    }
}

