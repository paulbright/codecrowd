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
        //Test t = new Test();
        //t.print();

        q4();

    }

    public static void q4() {
        int[] n1 = new int[3];
        int[] n2 = {10, 20, 30, 40, 50};
        n1 = n2;
        for (int x : n1) {
            System.out.print(x + ":");
        }

    }

    public static void q3() {
        String[] s = new String[2];
        int i = 0;
        for (String s1 : s) {
            s[i].concat("Element " + i);
            i++;
        }
        for (i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void q2() {
        byte bite = 0;
        int a = 10;
        float f = 100;
        float b = 10.25f;
        double c = 100;
        a = (int) b;
        b = a;
        c = b;
        c = a;

        bite = (byte) a;
        b = (float) c;

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
