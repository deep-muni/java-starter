package com.learning.kata;

public class FizzBuzz {
  public String convert(Integer value) {
    if (isMultipleOfThree(value) && isMultipleOfFive(value)) {
      return "FizzBuzz";
    }
    if (isMultipleOfThree(value)) {
      return "Fizz";
    }
    if (isMultipleOfFive(value)) {
      return "Buzz";
    }
    return value.toString();
  }

  private static boolean isMultipleOfFive(Integer value) {
    return value % 5 == 0;
  }

  private static boolean isMultipleOfThree(Integer value) {
    return value % 3 == 0;
  }
}
