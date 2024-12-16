package com.kata.fizzbuzz;

public class FizzBuzzNumber {
  private final Integer number;

  public FizzBuzzNumber(Integer number) {
    this.number = number;
  }

  public String convert() {
    if (number == 3) {
      return "Fizz";
    }
    return number.toString();
  }
}
