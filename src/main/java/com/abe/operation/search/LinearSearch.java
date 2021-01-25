package com.abe.operation.search;


public class LinearSearch<T extends Comparable<T>> implements Search {

    private T [] arr;
    public LinearSearch(T [] arr) {
        this.arr = arr;
    }

    @Override
    public <T extends Comparable<T>> int search(T[] arr, T element) {
        if (arr == null) {
            throw new IllegalArgumentException("Array input cannot be null");
        }

        if (arr.length == 0) {
            return -1;
        }

        if (arr.length == 1) {
            return arr[0] == element ? 0 : -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }
}
