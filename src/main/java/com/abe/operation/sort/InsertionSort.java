package com.abe.operation.sort;

public class InsertionSort<T extends Comparable<T>> extends Sort {


    public InsertionSort(T [] arr) {
        super(arr);
    }

    public InsertionSort() {
    }

    @Override
    public void doSort() {
        for (int i = 1; i < arr.length; i++) {
            Comparable key = arr[i];
            int sortLast = i - 1;

            while (sortLast >= 0 && arr[sortLast].compareTo(key) > 0) {
                arr[sortLast + 1] = arr[sortLast];
                sortLast--;
            }

            arr[sortLast + 1] = key;
        }
    }

}
