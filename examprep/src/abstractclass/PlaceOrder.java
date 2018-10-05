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
public class PlaceOrder {
    public static void main(String[] args) {
	OnlineOrder onlineOrder = new OnlineOrder("big discount coupon", 2000);
	OnlineOrder onlineOrder2 = new OnlineOrder(3000);
	//WarehouseOrder wOrder = new WarehouseOrder();
//	onlineOrder.validate();
//	onlineOrder.process();
	onlineOrder.printDetails();
	//wOrder.printDetails();
    }
}
