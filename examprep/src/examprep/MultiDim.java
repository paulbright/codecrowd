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
    
    public MultiDim(){
        n = new int[5]; 
    }
    public static void main(String[] args) {
        MultiDim m = new MultiDim();
        m.test();
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
