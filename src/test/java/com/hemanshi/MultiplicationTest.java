package com.hemanshi;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class MultiplicationTest {

  @Rule public ExpectedException exceptionRule = ExpectedException.none();

  @Test public void testDoOperation() throws Exception {

    Multiplication mul = new Multiplication();
    assertEquals(4, mul.doOperation("2", "2"), 0);
  }
}
