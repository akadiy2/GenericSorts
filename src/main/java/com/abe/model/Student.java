package com.abe.model;


import java.util.Objects;

public class Student implements Comparable {
    private String name;
    private int age;

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
