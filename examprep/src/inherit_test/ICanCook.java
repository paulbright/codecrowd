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

/*
An interface is 100% abstract class(Implicitly). After Java 8 it doesn’t hold true.
Interfaces can be implemented by any class from any inheritance tree.
All methods in Interfaces are abstract. (In Java 8 either abstract/ static / default)
An interface can have constants, these constants are public, static and final(Implicitly).
Interface methods are implicitly public & abstract. (Before Java 8)
An interface can also have private methods. (Java 9)
A class implementing an interface can also be an abstract class.
An abstract class which is implementing an interface need not implement all abstract method.
A class can Implement more than one Interface.
Interfaces can not extend a class or implement an Interface.
An interface can extend another Interface.
A non-abstract class which is implementing an Interface needs to follow some rules.
This class needs to provide the concrete implementation of all abstract method.
All rules of Overriding needs to be followed.
It must maintain the exact signature of a method.
After Java 9 changes, Interfaces look a lot like Abstract Class, still, there are some differences.
An abstract class can have variables with different modifiers which is not constant
Methods in Abstract can have the different signature than just private or public
*/
public interface ICanCook {
    
}
