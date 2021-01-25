package com.abe.operation.search;


public abstract class Search<T extends Comparable<T>> {
    private T[] arr;

    public Search(T[] arr) {
        this.arr = arr;
    }

    public Search() {

    }
    public abstract int search(T [] arr, T element);

    public void setArr(T [] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return this.arr;
    }

}
