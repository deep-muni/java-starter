package com.learning.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  private static FizzBuzz fizzBuzz;

  @BeforeAll
  static void beforeAll() {
    fizzBuzz = new FizzBuzz();
  }

  @ParameterizedTest
  @CsvSource({"1,1", "2,2", "4,4", "7,7", "8,8", "11,11", "13,13", "14,14"})
  void should_convert_to_same_number(Integer value, String expected) {
    assertEquals(expected, fizzBuzz.convert(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {6, 9, 12})
  void convert_multiple_of_3_and_not_contains_3_to_Fizz(Integer value) {
    assertEquals("Fizz", fizzBuzz.convert(value));
  }

  @ParameterizedTest
  @ValueSource(ints = {10})
  void convert_multiple_of_5_and_not_contains_5_to_Buzz(Integer value) {
    assertEquals("Buzz", fizzBuzz.convert(value));
  }

  @Test
  void convert_15_to_FizzBuzzBuzz() {
    assertEquals("FizzBuzzBuzz", fizzBuzz.convert(15));
  }

  @Test
  void convert_3_to_FizzFizz() {
    assertEquals("FizzFizz", fizzBuzz.convert(3));
  }

  @Test
  void convert_5_to_BuzzBuzz() {
    assertEquals("BuzzBuzz", fizzBuzz.convert(5));
  }
}
