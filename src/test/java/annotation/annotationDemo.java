package annotation;

public class annotationDemo {
    public static void main(String[] args) {
        // Cú Pháp: @ + Tên

        // @Override
        annotationDemo demo = new annotationDemo();
        System.out.println("demo = " + demo);

        // @Deprecated
        int max = Math.maxV1(1,0);
        System.out.println("max = " + max);

        // SuppressWarnings
        @SuppressWarnings("deprecation")
        int m = Math.maxV1(1,0);
        System.out.println("max = " + max);
    }
    @Override
    public String toString() {
        return "This is AnnotationDemo class";
    }
}
