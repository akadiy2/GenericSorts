package com.abe.operation.search;

public enum SearchType {
    LINEAR, BINARY;

    public static SearchType fromString(String input) {
        for (SearchType s : SearchType.values()) {
            if (input.equalsIgnoreCase(s.name())) {
                return s;
            }
        }

        throw new IllegalArgumentException("Invalid input received");
    }
}
