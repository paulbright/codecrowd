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
public class TestInheritance {
    public static void main(String[] args) {
	
	//Animal a = new Animal(); 
	//Dog x = (Dog) a; 
	
	//x.cry();
	
	//Dog d = new Dog(); 

	//a.cry(); 
	
//	TestInheritance ti = new TestInheritance();
//	ti.cry(d);
//	ti.cry(c);
        //WildCat african_wild_cat = new WildCat();
//	Cat cat  = new Cat();
//	Dog dog = new Dog(); 
//
//        TestInheritance ti = new TestInheritance();
//        ti.cry(african_wild_cat);
//        ti.cry(cat);
//	ti.cry(dog);
        /*
        Butler bob = new Butler("Bob");
        Secretary sec = new Secretary("Rachel");
        ti.employeeSkills(sec);
        ti.employeeSkills(bob);
        
        Butler x = new Butler ("bob"); 
        x.testButler();
        if(x == bob) {
            System.out.println("x==b");
        }
        
        if(x.equals(bob)) {
            System.out.println("x equals b");
        }
        */
    }
    
    public void employeeSkills(Employee emp){
        if(emp instanceof ICanCook) {            
            System.out.println(emp.getName() + " can cook");
        }
        
        if(emp instanceof ICanDrive) {            
            System.out.println(emp.getName() + " can drive");
        }
    }
    public void cry(Animal animal){
        animal.cry();
    }
}
