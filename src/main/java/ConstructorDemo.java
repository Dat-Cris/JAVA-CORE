public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // 1. Tên constructor trùng với tên class
        // 2. Constructor không có kiểu trả về
        Dog dog1 = new Dog("Long", 2);
        System.out.println("dog1 = " + dog1);

        Dog dog2 = new Dog("Linh");
        System.out.println("dog2 = " + dog2);

        // Mặc định: 0 tham số
        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);
    }

    public static class Dog {

        public String name;
        protected int age;

        String color;
        private int id;

        public Dog() {
            System.out.println("Khởi tạo 0 tham số");
        }

        public Dog(String name) {
            System.out.println("Khởi tạo 1 tham số");
            this.name = name;
        }

        public Dog(String name, int age) {
            System.out.println("Khởi tạo 2 tham số");
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "ConstructorDemo.entity.Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
