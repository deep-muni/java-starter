package com.kata.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzNumberShould {

  @Test
  void convert_1_to_1() {
    FizzBuzzNumber number = new FizzBuzzNumber(1);
    assertThat(number.convert()).isEqualTo("1");
  }

  @Test
  void convert_2_to_2() {
    FizzBuzzNumber number = new FizzBuzzNumber(2);
    assertThat(number.convert()).isEqualTo("2");
  }

  @Test
  void convert_3_to_Fizz() {
    FizzBuzzNumber number = new FizzBuzzNumber(3);
    assertThat(number.convert()).isEqualTo("Fizz");
  }
}
