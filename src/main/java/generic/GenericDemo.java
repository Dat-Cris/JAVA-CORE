package generic;

public class GenericDemo {
    public static void main(String[] args) {

        // Quy ước
        // T - Type
        // E - Element
        // N - Number
        // k - Key
        // V - Value


        // generic class / interface
        Dog<Integer> dog1 = new Dog<>("long",1);
        System.out.println(dog1);
        Dog<Double> dog2 = new Dog<>("Ha", 2.5) ;
        System.out.println(dog2);

        // generic method
        Printer.printAny(4);
        Printer.printAny(4.5);
        Printer.printAny(dog1);

        // bounded type
        // Dog<String> dog3 = new Dog<>("Tùng", "ABC") ;

        // Multiple bounds
        int max= Math.max(1,99);
        System.out.println("max = " + max);
    }
}
