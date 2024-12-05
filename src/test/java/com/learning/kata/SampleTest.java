package com.learning.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {

  @Test
  void hello_test() {
    Sample sampleTest = new Sample();
    assertEquals("Hello", sampleTest.sayHello());
  }
}
