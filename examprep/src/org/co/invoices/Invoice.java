/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.co.invoices; 


public class Invoice{
    private String name = "Default Invoice";
    private double value = 0.0;
    public Invoice(String name, double value){
	this.name = name;
	this.value = value;
    }
    
    public void printInvoice(){
	System.out.println(name + ":" + value);
    }
    
}