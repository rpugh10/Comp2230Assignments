import java.util.Stack;

public class PalindromeEvaluator {

    private Stack<String> stack;

    public PalindromeEvaluator(){
        stack = new Stack<>();
    }

    public String reverseString(String expression){
        String token;
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            token = String.valueOf(ch);
            stack.push(token);
        }
        

        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }

       return builder.toString();
    }

    public boolean isPalindrome(String expression){
        expression = expression.replaceAll("\\s","").toLowerCase();
        String reversed = reverseString(expression);

        return expression.equals(reversed);
    }
}
