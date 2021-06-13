package com.abe.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fraction implements Comparable<Fraction>{

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot create fraction because the denominator is 0: " + numerator + " " + denominator);
        }
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    public void add(Fraction fraction) {

        int n1 = this.numerator * fraction.getDenominator();
        int d1 = this.denominator * fraction.getDenominator();
        int n2 = fraction.getNumerator() * this.denominator;

        this.setNumerator(n1 + n2);
        this.setDenominator(d1);
        this.simplify();
    }

    public void subtract(Fraction fraction) {
        int n1 = this.numerator * fraction.getDenominator();
        int d1 = this.denominator * fraction.getDenominator();
        int n2 = fraction.getNumerator() * this.denominator;

        this.setNumerator(n1 - n2);
        this.setDenominator(d1);
        this.simplify();
    }

    public void multiply(Fraction fraction) {
        this.setNumerator(this.numerator * fraction.getNumerator());
        this.setDenominator(this.denominator * fraction.getDenominator());

        this.simplify();
    }

    public void divide(Fraction fraction) {
        this.setNumerator(this.numerator * fraction.getDenominator());
        this.setDenominator(this.denominator * fraction.getNumerator());
        this.simplify();
    }

    public double evaluate() {
        this.simplify();
        return this.numerator * 1.0 / this.denominator;
    }

    public void simplify() {
        int n = this.getNumerator();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return;
        }

        List<Integer> dList = new ArrayList<>();

        int d = this.getDenominator();
        for (int i = 1; i <= d / 2; i++) {
            if (d % i == 0 && list.contains(i)) {
                dList.add(i);
            }
        }

        if (dList.isEmpty()) {
            return;
        }

        int nbrToDivideBy = dList.get(dList.size() - 1);

        this.setDenominator(d / nbrToDivideBy);
        this.setNumerator(n / nbrToDivideBy);

    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fraction)) {
            return false;
        } else {
            Fraction f = (Fraction) o;
            return this.evaluate() == f.evaluate();
        }
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Integer.hashCode(this.numerator);
        result = 31 * result + Integer.hashCode(this.denominator);
        return result;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }


    @Override
    public int compareTo(Fraction o) {
        double f1 = this.evaluate();
        double f2 = o.evaluate();

        return Double.compare(f1, f2);
    }
}
