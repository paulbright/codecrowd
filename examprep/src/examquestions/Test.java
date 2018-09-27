package examquestions;

public class Test {

    char c;
    boolean b;
    float f;

    public void print() {

        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }

    public void test() {
        int x;
        char c;
        boolean b;
        //System.out.println(x);
        //System.out.println(c);

    }

    static public void main(String[] args) {
        Test t = new Test();
        //t.print();
        
        q1();
        
    }

    public static void q1() {
        int[][] n = new int[1][3];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j > n[i].length; j++) {
                n[i][j] = 10;
            }
        }
        
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j > n[i].length; j++) {
                System.out.println(n[i][j]);
            }
        }
    }
}
