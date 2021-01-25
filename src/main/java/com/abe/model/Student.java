package com.abe.model;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Student implements Comparable {
    private String name;
    private int age;

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;

            return this.age - other.getAge();



    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo(o) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student with name: ").append(this.name).append(" with age: ").append(this.age);
        return sb.toString();
    }
}
