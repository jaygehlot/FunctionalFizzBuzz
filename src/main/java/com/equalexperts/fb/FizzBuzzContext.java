package com.equalexperts.fb;

import java.util.function.Predicate;

public class FizzBuzzContext implements Comparable<FizzBuzzContext> {
    String fizzBuzz;
    Predicate<Integer> predicate;
    int count;
    private int reportOrder;

    public FizzBuzzContext(String fizzBuzz, Predicate<Integer> predicate, int count, int reportOrder) {
        this.fizzBuzz = fizzBuzz;
        this.predicate = predicate;
        this.count = count;
        this.reportOrder = reportOrder;
    }

    @Override
    public int compareTo(FizzBuzzContext o) {
        return Integer.compare(this.reportOrder, o.reportOrder);
    }
}
