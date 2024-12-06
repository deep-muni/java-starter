package com.learning.kata;

public class FizzBuzz {
  public String convert(Integer value) {
    if (value % 3 == 0) {
      return "Fizz";
    }
    if (value.equals(5)) {
      return "Buzz";
    }
    return value.toString();
  }
}
