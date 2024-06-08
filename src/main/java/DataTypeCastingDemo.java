public class DataTypeCastingDemo {
    public static void main(String[] args) {
        // Widening
        // byte -> short -> int -> long -> float -> double
        byte a = 10;
        int b = (int) a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Narrowing
        //double -> float -> long -> int -> short -> byte
        long m =10;
        int n = (int) m;
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        // chú ý
        int x = 1;
        int y = 2;
        System.out.println((float)x / y);
        System.out.println(x / (float) y);
        System.out.println((float) x / (float) y);
        System.out.println((float) (x / y));

        char c = 65;
        System.out.println("c = " + c);
    }
}
