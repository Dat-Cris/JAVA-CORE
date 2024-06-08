public class StringDemo {
    public static void main(String[] args) {
        // Nguyên thủy (Primitive)
        String s1 = "Java Core";
        String s2 = "Java Core";

                // Non primitive
        String s3 = new String("java Core");
        String s4 = new String("java Core");

        // So sánh == và equals

        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); // false
        System.out.println(s3 == s4); // false


        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // false
        System.out.println(s4.equals(s4)); // true
    }
}
