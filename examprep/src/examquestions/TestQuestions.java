package examquestions;

import inherit_test.newpackage.A;
import inherit_test.B;
import inherit_test.Butler;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
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
//	xyz();
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
//        q14();
//	  q15();    
//	  q16();
//	  q17();
//	q18();
//	q19();
//	q20();
//	q22();
//	q23();
//	q26();
//	q27();
//	q28();
//	q29();
//	q30();
//	q31();
//	q32();
q34();
    }
   
    public static void q34() {
        File dir = new File("F:" + File.separator + "A" + File.separator + "B");
        System.out.println(dir.getParentFile().getParent());
    }
    
    public static void xyz() {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);
    }
     public static void q33(){
	    //List<String> list = new /*INSERT*/(); 
	    List<String> list = new ArrayList<>();
	    List<String> list1 = new ArrayList<String>();
	    
	    //List<String> list3 = new List<String>();
	    
	    
     }
    
     public static void q32() {
         String fruit = "mango";
         switch (fruit) {
             default:
                 System.out.println("ANY FRUIT WILL DO");
             case "Apple":
                 System.out.println("APPLE");
             case "Mango":
                 System.out.println("MANGO");
             case "Banana":
                 System.out.println("BANANA");
                 break;
         }
     }
     public static void q31() {
         List<Character> list = new ArrayList<>();
         list.add(0, 'V');
         list.add('T');
         list.add(1, 'E');
         list.add(3, 'O');
	
	 System.out.println(list);
	 
	 System.out.println("");
         if(list.contains('O')) {
             list.remove('O');
	     //list.remove(new Character('O'));
         }
 
         for(char ch : list) {
             System.out.print(ch);
         }
	 
	 System.out.println("");
     }
    public static void q30() {
         //System.out.println("Output is: " + 10 != 5);
	 
	 System.out.println("Output is: " + (10 != 5));
	 System.out.println(10 != 5 ? "A" :"B"  + "hello");
	 
	 System.out.println( (10 != 5 ? "A" :"B")  + "hello");
	 System.out.println("wow" + (10 != 5 ? "A" :"B"));
     }
     public static void q29() {
         do {
             System.out.println(100);
	    
         } while (true);
        // System.out.println("Bye");
     }
     
    public static void q28() {
         LocalTime time = LocalTime.of(12, 40);
         //String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
	 String amPm = time.getHour() > 12 ? "PM" : time.getHour() == 12 ? "Noon" : "AM";
	 String xyz = time.getHour() > 12 ? "PM" : "AM";
         System.out.println(xyz);
     }
    
    public static void q27() {
         String str = "java";
	 String str2 = "java";
         StringBuilder sb = new StringBuilder("java");
 
         System.out.println(str.equals(sb) + ":" + sb.equals(str));
	 
	 System.out.println(str.equals(str2) + ":" + str2.equals(str));
     }
    public static void q26() {
         Period period = Period.of(0, 0, 0);
         System.out.println(period);
	 period = Period.ofDays(0);
         System.out.println(period);
	 period = Period.ofMonths(0);
         System.out.println(period);
     }
    public static void q25() {
         int grade = 60;
//         if(grade = 60)
//             System.out.println("You passed...");
//         else
//             System.out.println("You failed...");
     }
    public static void q23(){
	references.Test.point_test();
    }
    public static void q22() {
         String [] fruits = {"apple", "banana", "mango", "orange"};
         for(String fruit : fruits) {
             System.out.print(fruit + " ");
             if(fruit.equals("mango")) {
                 continue;
             }
             System.out.println("salad!");
             break;
         }        
     }
    public static void q21() {
	int y = 1;
	double d = y;
         //double [] arr = new int[2]; //Line 3
         //System.out.println(arr[0]); //Line 4
     }
     public static void q20() {
         LocalDate date = LocalDate.of(2012, 1, 11);
         Period period = Period.ofMonths(5);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
         System.out.print(formatter.format(date.minus(period)));
     }
     public static void q19() {
         int a = 100;
         System.out.println(-a++);
	 System.out.println(-a);
     }
    public static void q18() {
         short [] args = new short[]{50, 50};
         args[0] = 5;
         args[1] = 10;
         System.out.println("[" + args[0] + ", " + args[1] + "]");
     }
    public static void q17() {
         List<String> dryFruits = new ArrayList<>();
         dryFruits.add("Walnut");
         dryFruits.add("Apricot");
         dryFruits.add("Almond");
         dryFruits.add("Date");
 
         Iterator<String> iterator = dryFruits.iterator();
         while(iterator.hasNext()) {
             String dryFruit = iterator.next();
             if(dryFruit.startsWith("A")) {
                 dryFruits.remove(dryFruit);
		 //iterator.remove();
             }
         }
        
         System.out.println(dryFruits);
    }
    public static void q16() {
	List<Integer> list = new ArrayList<>();
	list.add(100);
	list.add(200);
	list.add(100);
	list.add(200);
	list.remove(100);
	//list.remove(new Integer(100));
	//list.remove(new Integer(100));
	//list.remove(new Integer(100));
	System.out.println(list);
    }
    private static void q15(){
	 int [] arr = {2, 3, 0};
	 
	 System.out.println(arr.length);

         for(int i : arr) {
             System.out.println(arr[i]);
         }
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
