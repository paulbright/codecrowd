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
import java.time.LocalTime;
 
public class DateTest {
     public static void main(String [] args) {
         LocalDate date = LocalDate.parse("1947-08-14");
         LocalTime time = LocalTime.MAX;
         System.out.println(date.atTime(time));
     }
}