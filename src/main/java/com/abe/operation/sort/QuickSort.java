package com.abe.operation.sort;

public class QuickSort<T extends Comparable<T>> extends Sort {
    private T [] arr;


    @Override
    public void doSort() {
        int low = 0;
        int high = this.arr.length - 1;

        doSort(low, high);
    }

    private void doSort(int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            doSort(low, j - 1);
            doSort(j + 1, high);
        }
    }

    private int partition(T [] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }
}
