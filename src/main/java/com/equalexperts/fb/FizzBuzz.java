package com.equalexperts.fb;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<FizzBuzzContext> fizzBuzzContexts;
    private int integerCount = 0;

    public FizzBuzz() {
        fizzBuzzContexts = asList(
            new FizzBuzzContext("lucky", x -> Integer.toString(x).contains("3"), 0, 4),
            new FizzBuzzContext("fizzbuzz", x -> x % 15 == 0, 0, 3),
            new FizzBuzzContext("buzz", x -> x % 5 == 0, 0, 2),
            new FizzBuzzContext("fizz", x -> x % 3 == 0, 0, 1)
        );
    }

    public String calculate(int num) {
        for (FizzBuzzContext fizzBuzzContext: fizzBuzzContexts) {
            if (fizzBuzzContext.predicate.test(num)) {
                fizzBuzzContext.count++;
                return fizzBuzzContext.fizzBuzz;
            }
        }
        integerCount++;
        return Integer.toString(num);
    }


    public List<FizzBuzzContext> getFizzbuzzContexts() {
        List<FizzBuzzContext> newFizzBuzzContexts = new ArrayList<>(fizzBuzzContexts);
        newFizzBuzzContexts.add(new FizzBuzzContext("integer", null, integerCount, 5));
        return newFizzBuzzContexts;
    }
}
