package com.learning.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    @BeforeAll
    static void beforeAll() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void should_convert_to_same_number(Integer value, String expected) {
        assertEquals(expected, fizzBuzz.convert(value));
    }

    @Test
    void convert_3_to_Fizz() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    void convert_5_to_Buzz() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    void convert_6_to_Fizz() {
        assertEquals("Fizz", fizzBuzz.convert(6));
    }
}
