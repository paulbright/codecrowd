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
public class WarehouseOrder extends Order {

  private long warehouseId;
  
  public WarehouseOrder(){
      System.out.println("inside WarehouseOrder");
  }
  @Override
  public void validate() {
    // TODO Auto-generated method stub
  }

  @Override
  public void process() {
    // TODO Auto-generated method stub
  }
}
