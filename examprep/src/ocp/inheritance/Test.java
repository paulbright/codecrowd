/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.inheritance;

/**
 *
 * @author paulbright
 */
class Animal {
int a;
}
 
class Dog extends Animal {
    int a;
}
 
class Cat extends Animal {}
 
class A<T> {
    T t;
    void set(T t) {
        this.t = t;
    }
 
    T get() {
        return t;
    }
}
 
public class Test {
    public static <T> void print1(A<? extends Animal> obj) {
        //obj.set(new Dog()); //Line 22
        System.out.println(obj.get().getClass());
    }
 
    public static <T> void print2(A<? super Dog> obj) {
        obj.set(new Dog()); //Line 27
        System.out.println(obj.get().getClass());
    }
 
    public static void main(String[] args) {
        A<Dog> obj = new A<>();
       
        print1(obj); //Line 33
        print2(obj); //Line 34
    }
}

