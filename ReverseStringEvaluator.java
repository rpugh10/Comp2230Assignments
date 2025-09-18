
import java.util.Stack;

public class ReverseStringEvaluator {

    private Stack<String> stack;

    public ReverseStringEvaluator(){
        stack = new Stack<>();
    }

    public String reverseString(String expression){
        StringBuilder builder = new StringBuilder();
        String token ="";

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

}
