package Practice;

import java.util.Scanner;

public class PostfixTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PostfixEvaluator evaluator = new PostfixEvaluator();
        System.out.println("Enter a postfix expression: ");
        String expression = scan.nextLine();

        int result = evaluator.evaluate(expression);
        System.out.println("That expression equals: " + result);
        scan.close();
    }

}
