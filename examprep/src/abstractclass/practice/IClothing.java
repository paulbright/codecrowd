/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.practice;

/**
 *
 * @author A142400
 */
public interface IClothing {
   int SIZEKIDS = 1;
   int SIZESMALL = 2;
   int SIZEMEDIUM = 3;
   int SIZELARGE = 4;
   int SIZEFITALL = 99;
   public void buy();
   public void addToBasket(); 
   public void display();
}
