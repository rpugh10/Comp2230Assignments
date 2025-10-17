package Ch15Lists;

public class Test {

    public static void main(String[] args) {
        LinkedOrderedList<Integer> list = new LinkedOrderedList<>();

        list.add(10);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(12);

        System.out.println(list);
    }
}
