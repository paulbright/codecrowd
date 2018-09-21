/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author A142400
 */

/*
Rules to Remember
Abstract classes cannot be instantiated.

If a class has at least one abstract method, then the class must be declared abstract.

To use an abstract class, we must create a class that extends the abstract class (inheritance) and provide implementations for all abstract methods.

Java does not support multiple inheritance so we are only allowed to extend one class (abstract or not).    There is where interfaces become useful.
*/
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

public abstract class Order {

  private long id;
  private LocalDate createdOn;
  private long amount;

  public abstract void validate();
  public abstract void process();

  public Order(){
      this.id = new Random().nextLong();
      createdOn =  LocalDate.now();
      System.out.println("inside default constuctor Order");
  }
  public Order(long amount){
      this();
      this.amount = amount;
  }
  public final void cancel() { 
    // universal code for order cancellations
  }
  
  public void printDetails() {
      System.out.println("id:" + this.id + " amount:" + amount + " date:" + this.createdOn.toString() );
  }
}
