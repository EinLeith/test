import java.util.Scanner;
import java.util.regex.*;
import java.util.Random;



public class LeithTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String input = sc.nextLine();

        Pattern Mercedes = Pattern.compile("(Mercedes|Benz)\\.{6}");
        Matcher mercedes = Mercedes.matcher(input);

        if (mercedes.find()) {
            System.out.println(System.out.println(mercedes.group());import java.util.Scanner;
            import java.util.regex.*;
            import java.util.Random;

            public class LeithTest {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Random rand = new Random();
                    String input = sc.nextLine();

                    Pattern Mercedes = Pattern.compile("(Mercedes|Benz)\\.{6}");
                    Matcher mercedes = Mercedes.matcher(input);

                    if (mercedes.find()) {
                        System.out.println(mercedes.group());
                    }
                }
            }
        }
    }
}