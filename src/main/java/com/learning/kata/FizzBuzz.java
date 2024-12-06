package com.learning.kata;

public class FizzBuzz {
  public String convert(Integer value) {
    if (value.equals(3) || value.equals(6)) {
      return "Fizz";
    }
    if (value.equals(5)) {
      return "Buzz";
    }
    return value.toString();
  }
}
