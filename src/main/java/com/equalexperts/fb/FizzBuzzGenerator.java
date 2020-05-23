package com.equalexperts.fb;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzGenerator {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    String playFizzBuzz(int startOfRange, int endOfRange) {
        final List<String> fizzBuzzs = IntStream.range(startOfRange, endOfRange +1)
                .mapToObj(fizzBuzz::calculate).collect(toList());

        return fizzBuzzs.stream().collect(joining(" "))
                + " " + fizzBuzz.getFizzbuzzContexts()
                .stream()
                .sorted()
                .map(fizzBuzzContext -> fizzBuzzContext.fizzBuzz + ": " + fizzBuzzContext.count)
                .collect(joining(" "));
    }
}
