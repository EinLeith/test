import java.util.Scanner;
import java.util.regex.*;

public class azadTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("hallo laith");
        System.out.print("real oder barca");
        Pattern realMadrid = Pattern.compile("(real|Real|Madrid|madrid)");
        Pattern barca = Pattern.compile("(barca|Barca|Barcelona|barcelona)");

        String userInput = input.nextLine();
        Matcher realMadridMatcher = realMadrid.matcher(userInput);
        Matcher barcaMatcher = barca.matcher(userInput);

        if (realMadridMatcher.find()) {
            System.out.println("Hala Madrid");
        } else if (barcaMatcher.find()) {
            System.out.println("Visca Barca");
        }
    }
}