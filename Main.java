package com.akadatsky;

public class Main {

    public static void main(String[] args) {

        //IntList myList2 = new IntLinkedList();
        IntList myList = new IntArrayList();

        for (int i = 0; i < 20; i++) {
            myList.add(i);
        }
        System.out.println(myList);
        System.out.println("size: " + myList.size());
        System.out.println("isEmpty: " + myList.isEmpty());
        System.out.println(myList.get(6));
        System.out.println(myList.set(19, 99));
        System.out.println(myList.set(0, 88));
        System.out.println(myList);
        System.out.println(myList.subList(5, 19));
        System.out.println(myList.add(19, 100));
        System.out.println(myList.add(0, 200));
        System.out.println(myList);
        myList.clear();
        System.out.println("isEmpty: " + myList.isEmpty());
        System.out.println(myList);
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                myList.add(77);
                continue;
            }
            myList.add(i);
        }
        System.out.println(myList);
        System.out.println(myList.remove(19));
        System.out.println(myList);
        System.out.println(myList.removeByValue(77));
        System.out.println(myList);
    }

}