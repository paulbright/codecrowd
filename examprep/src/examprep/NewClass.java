/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examprep;

/**
 *
 * @author A142400
 */
public class NewClass {
    char c; 
    float f; 
    double d; 
   
    public void test(){

    }
  
    
    public static void main(String[] args) {
	
	int a = 100; 
	
	
	System.out.println( -a++);
	System.out.println(a);
	
	int ar[][] = {  
			{1,2,3,4,5},
			{44,22,33,77,55,3,6,7,8,9},
			{100,200}
		     };

	System.out.println(ar.length);
	System.out.println(ar[0].length);
	System.out.println(ar[1].length);
	System.out.println(ar[2].length);
//	row length = 3; 0-2;
//	column size = 5; 0  4;
//	

	for(int r = 0; r < ar.length; r++) {
	    //r=0
	    for(int c = 0; c < ar[r].length ; c++) {
		//c = 0;
		System.out.print(ar[r][c] + ",");
	    }
	    System.out.println("");
	}
    }
}
