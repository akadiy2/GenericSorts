package com.abe.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public int compareTo(Student other) {
        int i = this.name.compareTo(other.getName());
        if (i == 0) {
            return this.age - other.getAge();
        }

        return i;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) {
            return false;
        }

        return this.compareTo((Student)o) == 0;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
