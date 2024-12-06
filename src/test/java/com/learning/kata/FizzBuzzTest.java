package com.learning.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  private static FizzBuzz fizzBuzz;

  @BeforeAll
  static void beforeAll() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  void convert_1_to_1() {
    assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  void convert_2_to_2() {
    assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  void convert_3_to_Fizz() {
    assertEquals("Fizz", fizzBuzz.convert(3));
  }

  @Test
  void convert_5_to_Buzz() {
    assertEquals("Buzz", fizzBuzz.convert(5));
  }
}
