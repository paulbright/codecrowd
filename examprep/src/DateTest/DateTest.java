/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTest;

/**
 *
 * @author paulbright
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
 
public class DateTest {
     public static void main(String [] args) {
         test3();
     }
     private static void test1(){
         LocalDate date = LocalDate.parse("1947-08-14");
         LocalTime time = LocalTime.MAX;
         System.out.println(date.atTime(time));
     }
     private static void test(){
         LocalDateTime obj = LocalDateTime.now();
         System.out.println(obj.getSecond());
     }
     
     private static void test2(){
         LocalDate date = LocalDate.of(2020, 9, 31);
          System.out.println(date);
     }
     
     private static void test3() {
         List<LocalDate> dates = new ArrayList<>();
         dates.add(LocalDate.parse("2018-07-11"));
         dates.add(LocalDate.parse("1919-02-25"));
         dates.add(LocalDate.of(2020, 4, 8));
         dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
 
         dates.removeIf(x -> x.getYear() < 2000);
 
         System.out.println(dates);
     }
}