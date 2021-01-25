package com.abe.operation.search;

import com.abe.operation.sort.Sort;

@SuppressWarnings("ALL")
public class BinarySearch<T extends Comparable<T>> extends Search {
    private Sort sort;

    public BinarySearch(T[] arr, Sort sort) {
        super(arr);
        this.sort = sort;
    }

    public BinarySearch() {}

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @Override
    public int search(Comparable[] arr, Comparable element) {
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
