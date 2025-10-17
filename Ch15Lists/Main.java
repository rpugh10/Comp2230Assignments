package com.ch15lists;

public class Main {
    public static void main(String[] args) {
        LinkedOrderList<Integer> list = new LinkedOrderList<>();

        list.add(10);
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(7);
        
        System.out.println("hello");

        System.out.println(list);

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.first());
        System.out.println(list.last());
        System.out.println(list.contains(5));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        System.out.println(list);

        String expected = "[3, 7, 10]";
        String actual = list.toString();

        if(expected.equals(actual)){
            System.out.println("toString is working");
        }
        else{
            System.out.println("toString is not working");
        }
    }
}