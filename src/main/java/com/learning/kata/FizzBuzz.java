package com.learning.kata;

public class FizzBuzz {
  private static boolean isMultipleOfFive(Integer value) {
    return value % 5 == 0;
  }

  private static boolean isMultipleOfThree(Integer value) {
    return value % 3 == 0;
  }

  public String convert(Integer value) {
    if (isMultipleOfThree(value) || isMultipleOfFive(value)) {
      String prefix = whenDivisibleByThreeOrFive(value);

      if (value.toString().contains("3")) {
        return prefix + "Fizz";
      }

      if (value.toString().contains("5")) {
        return prefix + "Buzz";
      }

      return prefix;
    }
    return value.toString();
  }

  private String whenDivisibleByThreeOrFive(Integer value) {
    if (isMultipleOfThree(value) && isMultipleOfFive(value)) {
      return "FizzBuzz";
    }
    if (isMultipleOfThree(value)) {
      return "Fizz";
    }
    return "Buzz";
  }
}
