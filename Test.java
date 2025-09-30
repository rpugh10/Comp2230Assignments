package Practice;

public class Test {

    public static void main(String[] args) {
        DropoutStack<Integer> stack = new DropoutStack<>();

        stack.push(20);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);

        stack.undoPush();
        stack.undoPush();

        System.out.println(stack);
    }
}
