import java.util.Scanner;

public class PostfixTester {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a postfix expression: ");
        String expression = scan.nextLine();

        PostfixEvaluator evaluator = new PostfixEvaluator();

        int result = evaluator.evaluation(expression);

        System.out.println("The result " + result);
        
    }
}
