package com.equalexperts.fb;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

    final private FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @Test
    public void shouldReturnNumberItselfWhenItIsNotFizzbuzzNumbers() {
        callFizzBuzzAndAssert(1, 1, "1 fizz: 0 buzz: 0 fizzbuzz: 0 lucky: 0 integer: 1");
    }

    @Test
    public void shouldCombineTheNumbersWhenRangeHasMultipleNumbers() {
        callFizzBuzzAndAssert(1, 2, "1 2 fizz: 0 buzz: 0 fizzbuzz: 0 lucky: 0 integer: 2");
    }

    @Test
    public void shouldReturnFizzWithOtherNumbers() {
        callFizzBuzzAndAssert(6, 7, "fizz 7 fizz: 1 buzz: 0 fizzbuzz: 0 lucky: 0 integer: 1");
    }

    @Test
    public void shouldReturnBuzzWithOtherNumbers() {
        callFizzBuzzAndAssert(10, 11, "buzz 11 fizz: 0 buzz: 1 fizzbuzz: 0 lucky: 0 integer: 1");
    }

    @Test
    public void shouldReturnFizzBuzzWithOtherNumbers() {
        callFizzBuzzAndAssert(14, 15, "14 fizzbuzz fizz: 0 buzz: 0 fizzbuzz: 1 lucky: 0 integer: 1");
    }

    @Test
    public void shouldReturnNumbersWithFizzBuzz() {
        String expectedResult = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14" +
                " fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10";

        callFizzBuzzAndAssert(1, 20, expectedResult);
    }

    @Test
    public void shouldReturnLuckyWhereNumberContainsThree() {
        callFizzBuzzAndAssert(1, 3, "1 2 lucky fizz: 0 buzz: 0 fizzbuzz: 0 lucky: 1 integer: 2");
    }

    private void callFizzBuzzAndAssert(int startOfRange, int endOfRange, String expected) {
        assertThat(expected, is(fizzBuzzGenerator.playFizzBuzz(startOfRange, endOfRange)));
    }
}
