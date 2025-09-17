import java.util.Scanner;

public class BalancedParenthesesTester {

    public static void main(String[] args) {
        BalancedParenthesesEvaluator evaluator = new BalancedParenthesesEvaluator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a patter of parentheses: ");
        String expression = scan.nextLine();
        
        
        boolean result = evaluator.evaluateParentheses(expression);

        if(result == true){
            System.out.println("The stack is balanced");
        }
        else{
            System.out.println("The stack is not balanced");
        }
    }
}
