package com.learning.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void convert_1_to_1() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  void convert_2_to_2() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  void convert_3_to_3() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Fizz", fizzBuzz.convert(3));
  }
}
