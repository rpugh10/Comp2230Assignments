public class DropoutTest {
    public static void main(String[] args) {
        DropoutStack<Integer> stack = new DropoutStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        String expected = "[1, 2, 3, 4, 5]";
        String actual = stack.toString();

        if(expected.equals(actual)){
            System.out.println("toString is working");
        }
        else{
            System.out.println("toString failed");
        }

        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
