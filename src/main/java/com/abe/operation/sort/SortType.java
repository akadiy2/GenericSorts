package com.abe.operation.sort;

public enum SortType {
    BUBBLE("bubblesort"), INSERTION("insertionsort"), MERGE("mergesort"), QUICK("quicksort");

    private String name;
    SortType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static SortType fromString(String input) {
        for (SortType s : SortType.values()) {
            if (input.equalsIgnoreCase(s.name()) || s.getName().contains(input)) {
                return s;
            }
        }

        throw new IllegalArgumentException("Invalid input received");
    }
}
