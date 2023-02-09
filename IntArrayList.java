package com.akadatsky;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] arr = new int[10];
    private int size = 0;

    @Override
    public void add(int element) {
        add(size, element);
    }

    @Override
    public boolean add(int index, int element) {
        if (index <= size) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];

            System.arraycopy(arr, 0, newArr, 0, index);
            newArr[index] = element;
            System.arraycopy(arr, index, newArr, index + 1, size - index);

            arr = newArr;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        arr = new int[10];
        size = 0;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(int index) {
        if (index < size) {
            int[] newArr = new int[arr.length];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, size - index);
            arr = newArr;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeByValue(int value) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (value == arr[i]) {
                remove(i);
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public boolean set(int index, int element) {
        if (index < size) {
            arr[index] = element;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        if (fromIndex < toIndex && toIndex <= size) {
            IntList newArr = new IntArrayList();
            for(int i = fromIndex; i < toIndex; i++)
                newArr.add(arr[i]);
            return newArr;
        }
        return null;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        System.arraycopy(arr, 0, result, 0, size);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

}
