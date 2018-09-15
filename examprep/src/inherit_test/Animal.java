/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_test;

/**
 *
 * @author paulbright
 */
public class Animal {
    
    Animal (String animal_name){
        System.out.println("inside animal with name " + animal_name);
    }
    Animal(){
        System.out.println("inside Animal");
    }
    public void cry(){
        System.out.println("animal crying");
    }
}

class Cat extends Animal {
    Cat(){
        System.out.println("inside Cat");
    }
    
    public void cry(){
        System.out.println("Cat crying");
    }
}

class Dog extends Animal {
    Dog(){
        System.out.println("inside Dog");
    }
    public void cry(){
        System.out.println("dog crying");
    }
}

class WildCat extends Cat {
    WildCat(){
        System.out.println("inside WildCat");
    }
    public void cry(){
        System.out.println("wildcat crying");
    }
}