/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examprep;

/**
 *
 * @author paulbright
 */
public class MultiDim {
    int [] n; 
    int [] x = {1,2,3};
    int [][]y = { {1,2}, {4,5,6}, {7}, {8, 9, 10,11}};
    
    Double [][] d = new Double [3][4];
    Double [][] dd = new Double [2][5];
    Double [][] d3 = new Double [3][];
    Double [][] d4 = new Double [0][0];
    Double [][] d5 = new Double [0][];
    
    public MultiDim(){
        n = new int[5]; 
    }
    public static void main(String[] args) {
        MultiDim m = new MultiDim();
	System.out.println("d: " + m.d.length + " dd: " + m.dd.length +
			    "\nd[0]: " + m.d[0].length + " dd[0]: " + m.dd[0].length);
	System.out.println("d3: " + m.d3.length + " d4: " + m.d4.length);
	
	System.out.println(m.d5);
	m.d5 = new Double[1][2];
	System.out.println(m.d5);
	
	System.out.println(m.d5[0]);
	//System.out.println("d3: " + m.d3[0].length );
	
	//System.out.println(" d4: " + m.d4[0].length);
	
        //m.test();
    }
    public void test(){
        System.out.println( "," + y[0].length + "," + 
                y[1].length + "," + y.length);
        for(int i=0; i < y.length; i++){
            for(int j=0; j< y[i].length;j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
