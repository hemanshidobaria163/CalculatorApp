package com.hemanshi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SubstractionTest {

  @Test public void testDoOperation() {

    Substraction sub = new Substraction();
    assertEquals(-1, sub.doOperation("1", "2"), 0);
  }
}
