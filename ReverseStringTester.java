
import java.util.Scanner;

public class ReverseStringTester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReverseStringEvaluator evaluator = new ReverseStringEvaluator();

        System.out.println("Enter a string: ");
        String input = scan.nextLine();

       System.out.println(evaluator.reverseString(input));
    }

}
