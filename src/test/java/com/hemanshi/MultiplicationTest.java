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

  @Test public void testDoOperationException() throws Exception {

    Multiplication mul = new Multiplication();
    exceptionRule.expect(Exception.class);
    exceptionRule.expectMessage("Can not multiply by 0!");
    mul.doOperation("1", "0");
  }
}
