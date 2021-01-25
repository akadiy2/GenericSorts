package com.abe.operation.sort;

public class BubbleSort<T extends Comparable<T>> implements Sort {
    private T [] arr;

    public BubbleSort(T [] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return this.arr;
    }

    @Override
    public void doSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    swap(arr, i, j);
                }
            }
        }
    }
}
