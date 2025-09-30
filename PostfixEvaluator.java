package Practice;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

    private Stack<Integer> stack;

    public PostfixEvaluator(){
        stack = new Stack<>();
    }

    public boolean isOperator(String expression){
        return expression.equals("+") || expression.equals("-") ||
            expression.equals("*") || expression.equals("/");
    }

    public int doOperation(char operator, int num1, int num2){
        int result = 0;

        switch(operator){
            case '+':
            result = num1 + num2;
            break;

            case '-':
            result = num1 - num2;
            break;

            case '*':
            result = num1 * num2;
            break;

            case '/':
            result = num1 / num2;
            break;
        }

        return result;
    }

    public int evaluate(String expression){
        int num1, num2, result = 0;
        Scanner scan = new Scanner(expression);
        String token;

        while(scan.hasNext()){
            token = scan.next();
            if(isOperator(token)){
                num1 = stack.pop().intValue();
                num2 = stack.pop().intValue();
                result = doOperation(token.charAt(0), num1, num2);
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }

            scan.close();
            return result;
    }

}
