package com.abe.operation.sort;

public abstract class Sort<T extends Comparable<T>>  {
    protected T[] arr;

    public Sort(T[] arr) {
        this.arr = arr;
    }

    public Sort() {

    }

    protected void swap(T [] arr, int i , int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public abstract void doSort();

    public void setArr(T[] arr) {
        this.arr = arr;
    }
}
