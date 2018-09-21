/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.co.company;

import org.co.invoices.Invoice; 

public class Company
{
    public static void main(String [] args)
    {
	System.out.println("Inside company");
	System.out.println("Reading invoice ");
	Invoice inv = new Invoice("good invoice", 90.0);
	inv.printInvoice();
    }
}