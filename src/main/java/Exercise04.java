import java.util.Scanner;

public class Exercise04 {
    void question01() {

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Nhập một sâu kí tự");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;

            }
        }
    }

    void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu kí tự s1:");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào xâu kí tự s2:");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));


    }
    void quesiton03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn");
        String name = scanner.nextLine();
        String capitalizedName = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();
        System.out.println(capitalizedName);
    }
    void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn: ");
        String name = scanner.nextLine();

        int length = name.length();
        for (int i = 0; i<length; i++) {
            int n = i+1;
            char c = name.charAt(i);
            System.out.printf("kí tự thứ %d là: %c.%n", n , c);
        }
    }
    void question10(String s1, String s2){
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 ==! length2) {
            return"kO";
        }
        for (int i = 0; i < length1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(length1-1-i);
            if (c1 ==! c2) {
                return "KO";
            }
        }
        return "OK";
    }
    String question15(String s)
        String[] word = s.split("");
        String result = "";
        for (int i = words.lenth -1; i >= 0; i--) {
            result += word[i] + "";
    }
        return result.trim();

}


