import java.util.Stack;

public class BalancedParenthesesEvaluator {

    private Stack<String> stack;

    public BalancedParenthesesEvaluator(){
        stack = new Stack<>();
    }

    public boolean leftParentheses(String token){
        return (token.equals("("));
    }

    public boolean rightParentheses(String token){
        return (token.equals(")"));
    }

    public boolean evaluateParentheses(String expression){
        String token ="";

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            token = String.valueOf(ch);
            if (leftParentheses(token)) {
                stack.push(token);
            } else if (rightParentheses(token)) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();

    }
}
