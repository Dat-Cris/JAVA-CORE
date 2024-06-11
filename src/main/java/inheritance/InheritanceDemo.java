package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Tính kế thừa
        //  Mục đích: tái sử dụng code
        //Từ khóa extends
        Duck duck = new Duck("long", 2);
        duck.eat();

        // @Override
        duck.eat();

        // Từ khóa: super
        duck.eat();
        System.out.println("duck = " + duck);

        // Đơn kế thừa
    }
}
