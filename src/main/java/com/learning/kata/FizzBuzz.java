package com.learning.kata;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";

  private static boolean isMultipleOfFive(Integer value) {
    return value % 5 == 0;
  }

  private static boolean isMultipleOfThree(Integer value) {
    return value % 3 == 0;
  }

  private static String whenDivisibleByThreeOrFive(Integer value) {
    if (isMultipleOfThree(value) && isMultipleOfFive(value)) {
      return FIZZ_BUZZ;
    }
    return isMultipleOfThree(value) ? FIZZ : BUZZ;
  }

  private static String whenContainsThreeOrFive(Integer value) {
    List<String> suffix = new ArrayList<>();
    while (value > 0) {
      if (value % 10 == 3) {
        suffix.addFirst(FIZZ);
      }
      if (value % 10 == 5) {
        suffix.addFirst(BUZZ);
      }
      value /= 10;
    }
    return suffix.stream().reduce("", String::concat);
  }

  public String convert(Integer value) {
    if (isMultipleOfThree(value) || isMultipleOfFive(value)) {
      String prefix = whenDivisibleByThreeOrFive(value);
      String suffix = whenContainsThreeOrFive(value);
      return prefix + suffix;
    }
    return value.toString();
  }
}
