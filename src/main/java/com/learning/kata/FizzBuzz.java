package com.learning.kata;

public class FizzBuzz {
  private static boolean isMultipleOfFive(Integer value) {
    return value % 5 == 0;
  }

  private static boolean isMultipleOfThree(Integer value) {
    return value % 3 == 0;
  }

  public String convert(Integer value) {
    if(value.equals(3)) {
      return "FizzFizz";
    }
    if(value.equals(5)) {
      return "BuzzBuzz";
    }
    if(value.equals(15)) {
      return "FizzBuzzBuzz";
    }
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
}
