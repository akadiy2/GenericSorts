package com.abe.operation.search;

import com.abe.operation.sort.Sort;

public class BinarySearch<T extends Comparable<T>> implements Search {
    private Sort sort;
    private T [] arr;

    public BinarySearch(Sort s, T [] arr) {
        this.sort = s;
        this.arr = arr;
    }


    @Override
    public <T extends Comparable<T>> int search(T[] arr, T element) {
        this.sort.doSort();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int middle = (i + j) / 2;

            if (arr[middle].compareTo(element) > 0) {
                j = middle - 1;
            } else if (arr[middle].compareTo(element) < 0) {
                i = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
