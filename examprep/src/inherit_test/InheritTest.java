/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_test;

/**
 *
 * @author A142400
 */
abstract class Animall {
     private String name;
     /*
     Animall(){
	 
     }
    */
     Animall(String name) {
        this.name = name;
     }
 
     public String getName() {
         return name;
     }
}
 
class Dogg extends Animall {
     private String breed;
     Dogg(String breed) {
	 //comment off below and see what happens
	 super("");
         this.breed = breed;
     }
 
     Dogg(String name, String breed) {
         super(name);
         this.breed = breed;
     }
 
     public String getBreed() {
         return breed;
     }
}
 
public class InheritTest {
     public static void main(String[] args) {
         Dogg dog1 = new Dogg("Beagle");
         Dogg dog2 = new Dogg("Bubbly", "Poodle");
         System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + 
                             dog2.getName() + ":" + dog2.getBreed());
     }
}



