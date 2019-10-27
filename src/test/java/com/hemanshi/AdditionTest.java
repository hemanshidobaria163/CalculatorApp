package com.hemanshi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AdditionTest {

  @Test public void testDoOperation() {

    Addition add = new Addition();
    assertEquals(3, add.doOperation("1", "2"), 0);
  }
}
