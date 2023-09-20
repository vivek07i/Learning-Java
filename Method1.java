public class Method1 {
    // method overloading
    static int Addnum(int x, int y) {
        return x + y;
    }

    static double Addnum(double x, double y) {
        return x + y;
    }

    public static void main(String args[]) {
        int Mynum1 = Addnum(5, 9);
        double Mynum2 = Addnum(5.9, 6.7);
        System.out.println("Int" + Mynum1);
        System.out.println("Double" + Mynum2);

    }
}
