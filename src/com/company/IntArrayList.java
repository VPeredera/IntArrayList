package com.company;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] arr= new int[10];
    private int size = 0;

    @Override
    public void add(int element){
        if(size >= arr.length){
            int newSize = arr.length + 1;
            int[] newArr = new int[newSize];
            for (int i=0; i<size; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = element;
        size++;
    }

    @Override
    public boolean add(int index, int element){
        if(index > size || index < 0) return false;
        else {
            int newSize = arr.length + 1;
            int[] newArr = new int[newSize];
            for (int i=0; i<size; i++){
                if(i == index){
                    newArr[i] = element;
                    for(i=index; i<size;i++){
                        newArr[i+1]=arr[i];
                    }
                    break;
                }
                newArr[i] = arr[i];
            }
            arr = newArr;
            size++;
            return true;
        }
    }

    @Override
    public void clear(){
        size = 0;
    }

    @Override
    public int get (int index){
        return arr[index];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean remove(int index){
        if (index > size || index < 0) return false;
        else {
            int newSize = arr.length - 1;
            int[] newArr = new int[newSize];
            for (int i=size-1; i>=0; i--){
                if(i==index){
                    for(i=0; i<index;i++){
                        newArr[i]=arr[i];
                    }
                    break;
                }
                newArr[i-1] = arr[i];
            }
            arr = newArr;
            size--;
            return true;
        }
    }

    @Override
    public boolean removeByValue(int value){
        for(int i=0; i<size; i++){
            if(arr[i]==value){
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, int element){
        if(index > size || index < 0) return false;
        else {
            arr[index] = element;
            return true;
        }
    }

    @Override
    public int size(IntList arr){
        return toArray().length;
    }

    @Override
    public IntArrayList subList(int fromIndex, int toIndex){
        IntArrayList newArr = new IntArrayList();
        for(int i=fromIndex; i<=toIndex; i++){
            newArr.add(arr[i]);
        }
        return newArr;
    }

    @Override
    public int[] toArray(){
        int[] result = new int[size];
        for(int i=0; i<size; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}
