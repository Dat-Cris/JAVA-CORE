import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kiểu số nguyên
        // byte (1), short (2), int (4), long (8)
        int age =18;
        System.out.println("age = " + age);

        // kiểu số thực
        // float (4), double (8)
        float pi = 3.141592653F;
        System.out.println("pi = " + pi);
        double PI = 3.141592653;
        System.out.println("PI = " + PI);

        // Kiểu logic
        // boolean (1)
        boolean isloading = true;
        System.out.println("isloading = " + isloading);

        // Kiểu kí tự
        // char (2)
        char c = 'C';
        System.out.println("c = " + c);

        // Kiểu xâu kí tự
        // String
        String s = "Jav Core";
        System.out.println("s = " + s);

        // Kiểu thời gian
        // LocalDate, LoacalTime, LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = LocalDate.of(2019,3,19);
        System.out.println("date = " + date);

        // Kiểu enum
        UiState state = UiState.LOADING;
        System.out.println("state = " + state);

        // Kiểu array (mảng)
        int[] numbers = {2, 5, 9,4,1};
        System.out.println("numbers.length = " + numbers.length);
        // Chỉ số: bắt đầu từ 0
        System.out.println("numbers[0] = " + numbers[0]);
        // Cách Khác
        String[] fruits = new String[]{"cam", "mận", "Táo"};
        char[] characters = new char[10];
        System.out.println("characters.length = " + characters.length);
        // Cập nhập giá trị theo chỉ số
        System.out.println("characters[0] = " + characters[0]);
        characters[0] = 'k';
        System.out.println("characters[0] = " + characters[0]);



    }
}
