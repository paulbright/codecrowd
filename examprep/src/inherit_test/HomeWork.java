/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_test;

/**
 *
 * @author A142400
 */
public class HomeWork {

    String myStr = "7007";
    
    public void doStuff(String str) {
        int myNum = 0;
        try {
            this.myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne) {
	    //ne.printStackTrace();
            System.err.println("Exception:" + ne.getMessage());
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }
    public static void main(String[] args) {
        HomeWork obj = new HomeWork();
        obj.doStuff("9009");
    }
    
}

