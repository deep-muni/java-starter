package com.learning.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void convert_1_to_1() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("1", fizzBuzz.convert(1));
  }
}
