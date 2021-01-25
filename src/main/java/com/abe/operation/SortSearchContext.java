package com.abe.operation;

import com.abe.operation.search.BinarySearch;
import com.abe.operation.search.LinearSearch;
import com.abe.operation.search.Search;
import com.abe.operation.search.SearchType;
import com.abe.operation.sort.*;


// factory pattern?
public class SortSearchContext {
    public static Search getSearch(String input) {

            SearchType st = SearchType.fromString(input);


            return (SearchType.LINEAR == st) ? new LinearSearch<>() : new BinarySearch<>();
    }

    public static Sort getSort(String input) {

        SortType st = SortType.fromString(input);

        if (SortType.BUBBLE == st) {
            return new BubbleSort<>();
        } else if (SortType.INSERTION == st) {
            return new InsertionSort<>();
        } else if (SortType.QUICK == st) {
            return new QuickSort<>();
        } else if (SortType.MERGE == st) {
            return new MergeSort();
        } else {
            throw new IllegalArgumentException("Invalid input");
        }

    }
}
