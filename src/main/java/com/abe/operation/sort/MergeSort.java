package com.abe.operation.sort;

public class MergeSort implements Sort {
    private int arr[];

    public MergeSort(int arr[]) {
        this.arr = arr;
    }

    @Override
    public void doSort() {
        mergesort(0, arr.length - 1);
    }

    private void mergesort(int l, int h) {
        if (l < h) {
            int middle = (l + h) / 2;
            mergesort(l, middle);
            mergesort(middle + 1, h);
            merge(l, middle, h);
        }


    }

    private void merge(int l, int middle, int h) {
        int size1 = middle - l + 1;
        int size2 = h - middle;
        int [] left = new int [size1];
        int [] right = new int [size2];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[i + middle + 1];
        }

        int k = 1;

        int i = 0, j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            i++;
            arr[k] = left[i];
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
