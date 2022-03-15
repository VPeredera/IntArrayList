package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntArrayList list = new IntArrayList();
        for(int i=1; i<21; i++){
            list.add(i);
        }
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.add(14, 999));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.get(4));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(6));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.removeByValue(999));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.set(8, 555));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.size(list));
        System.out.println(list.subList(5, 15));
        list.clear();
        System.out.println(Arrays.toString(list.toArray()));
    }

}
