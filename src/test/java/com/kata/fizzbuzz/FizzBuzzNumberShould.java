package com.kata.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzNumberShould {

  @ParameterizedTest
  @CsvSource({"1,1", "2,2","4,4"})
  void convert_to_number_string_when_not_3(Integer value, String result) {
    FizzBuzzNumber number = new FizzBuzzNumber(value);
    assertThat(number.convert()).isEqualTo(result);
  }

  @Test
  void convert_3_to_Fizz() {
    FizzBuzzNumber number = new FizzBuzzNumber(3);
    assertThat(number.convert()).isEqualTo("Fizz");
  }

  @Test
  void convert_5_to_Buzz() {
    FizzBuzzNumber number = new FizzBuzzNumber(5);
    assertThat(number.convert()).isEqualTo("Buzz");
  }
}
