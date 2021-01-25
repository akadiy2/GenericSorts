package com.abe.operation.search;

public interface Search {
    <T extends Comparable<T>> int search(T [] arr, T element);
}
