import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

    private final char add = '+';
    private final char subtract = '-';
    private final char multiply = '*';
    private final char divide = '/';

    private Stack<Integer> stack;

    public PostfixEvaluator(){
        stack = new Stack<Integer>();
    }

   public boolean isOperator(String token){
    return (token.equals("+") || token.equals("-")||
        token.equals("*") || token.equals("/"));
   }

   public int calculation(char operation, int num1, int num2){

        switch(operation){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operation);
        }
   }

   public int evaluation(String expression){
        Scanner scan = new Scanner(expression);
        String token;
        int op1, op2, result = 0;

        while(scan.hasNext()){
            token = scan.next();
                if(isOperator(token)){
                    op2 = stack.pop();
                    op1 = stack.pop();
                    result  = calculation(token.charAt(0), op1, op2);
                    stack.push(result);
                }
                else{
                    stack.push(Integer.valueOf(token));
                }
        }
        return result;
   }
}
