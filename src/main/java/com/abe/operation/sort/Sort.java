package com.abe.operation.sort;

public interface Sort {
    default <T extends Comparable<T>> void swap(T [] arr, int i , int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void doSort();
}
